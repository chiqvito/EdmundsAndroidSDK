package pl.chiqvito.edmunds.sdk.client.vehicle;

import android.content.Context;

import pl.chiqvito.edmunds.sdk.dto.vehicle.response.EngineDTO;
import pl.chiqvito.edmunds.sdk.service.VehicleService;

public class EngineClient extends BaseVehicleClient<EngineDTO> {

    private final Integer styleId;

    public EngineClient(Context context, String apiKey, Integer styleId) {
        super(context, apiKey);
        this.styleId = styleId;
    }

    @Override
    protected void executeService(VehicleService service) {
        service.engines(styleId, this);
    }

}
