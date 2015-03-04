package pl.chiqvito.edmunds.sdk.client.vehicle;

import android.content.Context;

import pl.chiqvito.edmunds.sdk.client.BaseClient;
import pl.chiqvito.edmunds.sdk.service.VehicleService;
import retrofit.RestAdapter;

public abstract class BaseVehicleClient<K> extends BaseClient<K> {

    public BaseVehicleClient(Context context, String apiKey) {
        super(context, apiKey);
    }

    @Override
    protected void executeService(RestAdapter restAdapter) {
        VehicleService service = restAdapter.create(VehicleService.class);
        executeService(service);
    }

    protected abstract void executeService(VehicleService service);
}
