package pl.chiqvito.edmunds.sdk.client.media;

import android.content.Context;

import pl.chiqvito.edmunds.sdk.client.BaseClient;
import pl.chiqvito.edmunds.sdk.service.MediaService;
import retrofit.RestAdapter;

public abstract class BaseMediaClient<K> extends BaseClient<K> {
    public BaseMediaClient(Context context, String apiKey) {
        super(context, apiKey);
    }

    @Override
    protected void executeService(RestAdapter restAdapter) {
        MediaService service = restAdapter.create(MediaService.class);
        executeService(service);
    }

    protected abstract void executeService(MediaService service);
}
