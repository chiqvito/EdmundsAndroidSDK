package pl.chiqvito.edmunds.sdk.client.vehicle;

import android.content.Context;

import pl.chiqvito.edmunds.sdk.dto.enums.StateEnum;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.StylesCountDTO;
import pl.chiqvito.edmunds.sdk.service.VehicleService;

public class StylesCountClient extends BaseStylesClient<StylesCountDTO> {

    public StylesCountClient(Context context, String apiKey, String make, String model, Integer year, StateEnum state) {
        super(context, apiKey, make, model, year, state, null);
    }

    public StylesCountClient(Context context, String apiKey, String make, String model, Integer year) {
        this(context, apiKey, make, model, year, null);
    }

    public StylesCountClient(Context context, String apiKey, String make, String model) {
        this(context, apiKey, make, model, null, null);
    }

    public StylesCountClient(Context context, String apiKey, String make, String model, StateEnum state) {
        this(context, apiKey, make, model, null, state);
    }

    public StylesCountClient(Context context, String apiKey, String make) {
        this(context, apiKey, make, null, null, null);
    }

    public StylesCountClient(Context context, String apiKey, String make, StateEnum state) {
        this(context, apiKey, make, null, null, state);
    }

    public StylesCountClient(Context context, String apiKey) {
        this(context, apiKey, null, null, null, null);
    }

    public StylesCountClient(Context context, String apiKey, StateEnum state) {
        this(context, apiKey, null, null, null, state);
    }

    @Override
    protected void executeService(VehicleService service) {
        if (hasMakeModelYear())
            service.stylesCount(make, model, year, state, this);
        else if (hasMakeModel())
            service.stylesCount(make, model, state, this);
        else if (hasMake())
            service.stylesCount(make, state, this);
        else
            service.stylesCount(state, this);
    }

}
