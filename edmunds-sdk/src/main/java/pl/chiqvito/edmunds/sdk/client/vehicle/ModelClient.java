package pl.chiqvito.edmunds.sdk.client.vehicle;

import android.content.Context;

import pl.chiqvito.edmunds.sdk.dto.enums.StateEnum;
import pl.chiqvito.edmunds.sdk.dto.enums.ViewTypeEnum;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.ModelDTO;
import pl.chiqvito.edmunds.sdk.service.VehicleService;

public class ModelClient extends BaseModelsClient<ModelDTO> {

    private final String model;

    public ModelClient(Context context, String apiKey, String make, String model, StateEnum state, Integer year, ViewTypeEnum view) {
        super(context, apiKey, make, state, year, view);
        this.model = model;
    }

    public ModelClient(Context context, String apiKey, String make, String model) {
        this(context, apiKey, make, model, null, null, null);
    }

    public ModelClient(Context context, String apiKey, String make, String model, StateEnum state) {
        this(context, apiKey, make, model, state, null, null);
    }

    public ModelClient(Context context, String apiKey, String make, String model, Integer year) {
        this(context, apiKey, make, model, null, year, null);
    }

    public ModelClient(Context context, String apiKey, String make, String model, ViewTypeEnum view) {
        this(context, apiKey, make, model, null, null, view);
    }

    @Override
    protected void executeService(VehicleService service) {
        service.model(make, model, state, year, view, this);
    }
}
