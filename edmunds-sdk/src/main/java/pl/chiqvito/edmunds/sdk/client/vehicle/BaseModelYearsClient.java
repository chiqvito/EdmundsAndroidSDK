package pl.chiqvito.edmunds.sdk.client.vehicle;

import android.content.Context;

import pl.chiqvito.edmunds.sdk.dto.enums.StateEnum;
import pl.chiqvito.edmunds.sdk.dto.enums.ViewTypeEnum;

public abstract class BaseModelYearsClient<K> extends BaseVehicleClient<K> {

    protected final String make;
    protected final String model;
    protected StateEnum state;
    protected ViewTypeEnum view;

    public BaseModelYearsClient(Context context, String apiKey, String make, String model, StateEnum state, ViewTypeEnum view) {
        super(context, apiKey);
        this.make = make;
        this.model = model;
        this.state = state;
        this.view = view;
    }

}
