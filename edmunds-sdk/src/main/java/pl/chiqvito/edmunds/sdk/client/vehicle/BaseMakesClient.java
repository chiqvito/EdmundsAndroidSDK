package pl.chiqvito.edmunds.sdk.client.vehicle;

import android.content.Context;

import pl.chiqvito.edmunds.sdk.dto.enums.StateEnum;
import pl.chiqvito.edmunds.sdk.dto.enums.ViewTypeEnum;

public abstract class BaseMakesClient<K> extends BaseVehicleClient<K> {

    protected StateEnum state;
    protected Integer year;
    protected ViewTypeEnum view;

    public BaseMakesClient(Context context, String apiKey, StateEnum state, Integer year, ViewTypeEnum view) {
        super(context, apiKey);
        this.state = state;
        this.year = year;
        this.view = view;
    }

}
