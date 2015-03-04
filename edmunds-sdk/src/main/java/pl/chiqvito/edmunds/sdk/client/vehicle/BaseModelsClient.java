package pl.chiqvito.edmunds.sdk.client.vehicle;

import android.content.Context;

import pl.chiqvito.edmunds.sdk.dto.enums.StateEnum;
import pl.chiqvito.edmunds.sdk.dto.enums.ViewTypeEnum;

public abstract class BaseModelsClient<K> extends BaseVehicleClient<K> {
    
    protected final String make;
    protected StateEnum state;
    protected Integer year;
    protected ViewTypeEnum view;

    public BaseModelsClient(Context context, String apiKey, String make, StateEnum state, Integer year, ViewTypeEnum view) {
        super(context, apiKey);
        this.make = make;
        this.state = state;
        this.year = year;
        this.view = view;
    }

}
