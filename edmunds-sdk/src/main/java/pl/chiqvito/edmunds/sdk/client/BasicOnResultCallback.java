package pl.chiqvito.edmunds.sdk.client;

import pl.chiqvito.edmunds.sdk.BuildConfig;
import retrofit.RetrofitError;

public abstract class BasicOnResultCallback<K> implements OnResultCallback<K> {
    @Override
    public void onFail(RetrofitError error) {
        if (BuildConfig.DEBUG) {
            error.printStackTrace();
        }
    }
}
