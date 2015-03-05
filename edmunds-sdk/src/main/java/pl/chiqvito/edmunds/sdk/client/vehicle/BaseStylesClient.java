package pl.chiqvito.edmunds.sdk.client.vehicle;

import android.content.Context;

import pl.chiqvito.edmunds.sdk.dto.enums.StateEnum;
import pl.chiqvito.edmunds.sdk.dto.enums.ViewTypeEnum;

public abstract class BaseStylesClient<K> extends BaseVehicleClient<K> {

    protected final String make;
    protected final String model;
    protected final Integer year;
    protected StateEnum state;
    protected ViewTypeEnum view;

    public BaseStylesClient(Context context, String apiKey, String make, String model, Integer year, StateEnum state, ViewTypeEnum view) {
        super(context, apiKey);
        this.make = make;
        this.model = model;
        this.year = year;
        this.state = state;
        this.view = view;
    }

}
