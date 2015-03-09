package pl.chiqvito.edmunds.sdk.client.vehicle;

import android.content.Context;

import pl.chiqvito.edmunds.sdk.dto.vehicle.response.TransmissionDTO;
import pl.chiqvito.edmunds.sdk.service.VehicleService;

public class TransmissionClient extends BaseVehicleClient<TransmissionDTO> {

    private final Integer id;

    public TransmissionClient(Context context, String apiKey, Integer id) {
        super(context, apiKey);
        this.id = id;
    }

    @Override
    protected void executeService(VehicleService service) {
        service.transmissions(id, this);
    }

}
