package pl.chiqvito.edmunds.sdk.client;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

import pl.chiqvito.edmunds.sdk.ApiConstants;
import pl.chiqvito.edmunds.sdk.R;
import pl.chiqvito.edmunds.sdk.util.Boast;
import retrofit.Callback;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.OkClient;
import retrofit.client.Response;

public abstract class BaseClient<K> implements Callback<K>, RequestInterceptor, RestAdapter.Log {

    private static final String TAG = "RETROFIT_LOG";

    private String apiKey;

    protected final Context context;
    private OnResultCallback<K> onResultCallback;
    protected Handler handler;

    public BaseClient(Context context, String apiKey) {
        this(context, apiKey, false);
    }

    public BaseClient(Context context, String apiKey, boolean runInThread) {
        this.context = context.getApplicationContext();
        this.apiKey = apiKey;
        if (runInThread)
            handler = new Handler();
    }

    public void execute() {

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setClient(new OkClient())
                .setEndpoint(ApiConstants.API_URL)
                .setRequestInterceptor(this)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setLog(this)
                .build();

        executeService(restAdapter);
    }

    protected abstract void executeService(RestAdapter restAdapter);

    @Override
    public void success(final K k, final Response response) {
        if (handler != null) {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    sendResponse(k, response);
                }
            });
        } else {
            sendResponse(k, response);
        }
    }

    private void sendResponse(K k, Response response) {
        if (onResultCallback != null) {
            onResultCallback.onResponseOk(k, response);
        }
    }

    @Override
    public void failure(final RetrofitError error) {
        if (handler != null) {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    sendError(error);
                }
            });
        } else {
            sendError(error);
        }
    }

    private void sendError(RetrofitError error) {
        if (error.getResponse() != null) {
            Log.w(TAG, error.getResponse().getStatus() + " " + error.getResponse().getReason());
            switch (error.getResponse().getStatus()) {
                case 400: {
                    Boast.showText(context, R.string.err_bad_request, Toast.LENGTH_SHORT);
                    break;
                }
                case 401: {
                    Boast.showText(context, R.string.err_unauthorized, Toast.LENGTH_SHORT);
                    break;
                }
                case 403: {
                    Boast.showText(context, R.string.err_forbidden, Toast.LENGTH_SHORT);
                    break;
                }
                case 404: {
                    Boast.showText(context, R.string.err_not_found, Toast.LENGTH_SHORT);
                    break;
                }
                case 502: {
                    Boast.showText(context, R.string.err_bad_gateway, Toast.LENGTH_SHORT);
                    break;
                }
                case 503: {
                    Boast.showText(context, R.string.err_service_unavailable, Toast.LENGTH_SHORT);
                    break;
                }
                case 504: {
                    Boast.showText(context, R.string.err_gateway_timeout, Toast.LENGTH_SHORT);
                    break;
                }
                default: {
                    Boast.showText(context, error.getResponse().getReason(), Toast.LENGTH_SHORT);
                    break;
                }
            }
        }
        if (onResultCallback != null) {
            onResultCallback.onFail(error);
        }
    }

    public OnResultCallback<K> getOnResultCallback() {
        return onResultCallback;
    }

    public void setOnResultCallback(OnResultCallback<K> onResultCallback) {
        this.onResultCallback = onResultCallback;
    }

    @Override
    public void intercept(RequestFacade request) {
        request.addQueryParam("fmt", responseFormat());
        request.addQueryParam("api_key", apiKey());
    }

    @Override
    public void log(String message) {
        Log.v(TAG, message);
    }

    protected String responseFormat() {
        return ApiConstants.FMT_JSON;
    }

    private String apiKey() {
        return apiKey;
    }

    public Context getContext() {
        return context;
    }

}
