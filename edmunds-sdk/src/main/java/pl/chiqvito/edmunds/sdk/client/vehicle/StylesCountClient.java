package pl.chiqvito.edmunds.sdk.client.vehicle;

import android.content.Context;

import pl.chiqvito.edmunds.sdk.dto.enums.StateEnum;
import pl.chiqvito.edmunds.sdk.dto.enums.ViewTypeEnum;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.StylesCountDTO;
import pl.chiqvito.edmunds.sdk.service.VehicleService;

public class StylesCountClient extends BaseStylesClient<StylesCountDTO> {

    public StylesCountClient(Context context, String apiKey, String make, String model, Integer year, StateEnum state, ViewTypeEnum view) {
        super(context, apiKey, make, model, year, state, view);
    }

    public StylesCountClient(Context context, String apiKey, String make, String model, Integer year) {
        this(context, apiKey, make, model, year, null, null);
    }

    public StylesCountClient(Context context, String apiKey, String make, String model, Integer year, StateEnum state) {
        this(context, apiKey, make, model, year, state, null);
    }

    public StylesCountClient(Context context, String apiKey, String make, String model, Integer year, ViewTypeEnum view) {
        this(context, apiKey, make, model, year, null, view);
    }

    @Override
    protected void executeService(VehicleService service) {
        service.stylesCount(make, model, year, state, view, this);
    }

}
