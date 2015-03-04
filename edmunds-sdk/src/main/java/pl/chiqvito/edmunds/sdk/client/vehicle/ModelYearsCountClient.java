package pl.chiqvito.edmunds.sdk.client.vehicle;

import android.content.Context;

import pl.chiqvito.edmunds.sdk.dto.enums.StateEnum;
import pl.chiqvito.edmunds.sdk.dto.enums.ViewTypeEnum;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.YearsCountDTO;
import pl.chiqvito.edmunds.sdk.service.VehicleService;

public class ModelYearsCountClient extends BaseModelYearsClient<YearsCountDTO> {

    public ModelYearsCountClient(Context context, String apiKey, String make, String model, StateEnum state, ViewTypeEnum view) {
        super(context, apiKey, make, model, state, view);
    }

    public ModelYearsCountClient(Context context, String apiKey, String make, String model) {
        this(context, apiKey, make, model, null, null);
    }

    public ModelYearsCountClient(Context context, String apiKey, String make, String model, StateEnum state) {
        this(context, apiKey, make, model, state, null);
    }

    public ModelYearsCountClient(Context context, String apiKey, String make, String model, ViewTypeEnum view) {
        this(context, apiKey, make, model, null, view);
    }

    @Override
    protected void executeService(VehicleService service) {
        service.modelYearsCount(make, model, state, view, this);
    }

}
