package pl.chiqvito.edmunds.sdk.client.vehicle;

import android.content.Context;

import pl.chiqvito.edmunds.sdk.dto.enums.AvailabilityEnum;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.TransmissionsDTO;
import pl.chiqvito.edmunds.sdk.service.VehicleService;

public class TransmissionsClient extends BaseVehicleClient<TransmissionsDTO> {

    private final Integer styleId;
    private AvailabilityEnum availability;
    private String name;

    public TransmissionsClient(Context context, String apiKey, Integer styleId, AvailabilityEnum availability, String name) {
        super(context, apiKey);
        this.styleId = styleId;
        this.availability = availability;
        this.name = name;
    }

    public TransmissionsClient(Context context, String apiKey, Integer styleId, AvailabilityEnum availability) {
        this(context, apiKey, styleId, availability, null);
    }

    public TransmissionsClient(Context context, String apiKey, Integer styleId) {
        this(context, apiKey, styleId, null, null);
    }

    @Override
    protected void executeService(VehicleService service) {
        service.transmissions(styleId, availability, name, this);
    }

}
