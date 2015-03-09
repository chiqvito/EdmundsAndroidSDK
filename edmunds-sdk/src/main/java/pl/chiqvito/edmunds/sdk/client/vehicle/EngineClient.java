package pl.chiqvito.edmunds.sdk.client.vehicle;

import android.content.Context;

import pl.chiqvito.edmunds.sdk.dto.vehicle.response.EngineDTO;
import pl.chiqvito.edmunds.sdk.service.VehicleService;

public class EngineClient extends BaseVehicleClient<EngineDTO> {

    private final Integer id;

    public EngineClient(Context context, String apiKey, Integer id) {
        super(context, apiKey);
        this.id = id;
    }

    @Override
    protected void executeService(VehicleService service) {
        service.engines(id, this);
    }

}
