package pl.chiqvito.edmunds.sdk.client.vehicle;

import android.content.Context;

import pl.chiqvito.edmunds.sdk.dto.vehicle.response.OptionColorDTO;
import pl.chiqvito.edmunds.sdk.service.VehicleService;

public class ColorClient extends BaseVehicleClient<OptionColorDTO> {

    private final Integer id;

    public ColorClient(Context context, String apiKey, Integer id) {
        super(context, apiKey);
        this.id = id;
    }

    @Override
    protected void executeService(VehicleService service) {
        service.colors(id, this);
    }

}
