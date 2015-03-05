package pl.chiqvito.edmunds.sdk.client.vehicle;

import android.content.Context;

import pl.chiqvito.edmunds.sdk.dto.enums.StateEnum;
import pl.chiqvito.edmunds.sdk.dto.enums.ViewTypeEnum;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.StylesDTO;
import pl.chiqvito.edmunds.sdk.service.VehicleService;

public class StylesClient extends BaseStylesClient<StylesDTO> {

    public StylesClient(Context context, String apiKey, String make, String model, Integer year, StateEnum state, ViewTypeEnum view) {
        super(context, apiKey, make, model, year, state, view);
    }

    public StylesClient(Context context, String apiKey, String make, String model, Integer year) {
        this(context, apiKey, make, model, year, null, null);
    }

    public StylesClient(Context context, String apiKey, String make, String model, Integer year, StateEnum state) {
        this(context, apiKey, make, model, year, state, null);
    }

    public StylesClient(Context context, String apiKey, String make, String model, Integer year, ViewTypeEnum view) {
        this(context, apiKey, make, model, year, null, view);
    }

    @Override
    protected void executeService(VehicleService service) {
        service.styles(make, model, year, state, view, this);
    }

}
