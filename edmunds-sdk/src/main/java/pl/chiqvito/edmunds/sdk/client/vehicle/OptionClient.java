package pl.chiqvito.edmunds.sdk.client.vehicle;

import android.content.Context;

import pl.chiqvito.edmunds.sdk.dto.vehicle.response.OptionDTO;
import pl.chiqvito.edmunds.sdk.service.VehicleService;

public class OptionClient extends BaseVehicleClient<OptionDTO> {

    private final Integer id;

    public OptionClient(Context context, String apiKey, Integer id) {
        super(context, apiKey);
        this.id = id;
    }


    @Override
    protected void executeService(VehicleService service) {
        service.options(id, this);
    }
}

