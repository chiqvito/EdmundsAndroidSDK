package pl.chiqvito.edmunds.sdk.client;

import retrofit.RetrofitError;
import retrofit.client.Response;

public interface OnResultCallback<K> {
    void onResponseOk(K k, Response r);

    void onFail(RetrofitError error);
}
