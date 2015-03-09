package pl.chiqvito.edmunds.sdk.client.vehicle;

import android.content.Context;

import pl.chiqvito.edmunds.sdk.dto.enums.AvailabilityEnum;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.EnginesDTO;
import pl.chiqvito.edmunds.sdk.service.VehicleService;

public class EnginesClient extends BaseVehicleClient<EnginesDTO> {

    private final Integer styleId;
    private AvailabilityEnum availability;
    private String name;

    public EnginesClient(Context context, String apiKey, Integer styleId, AvailabilityEnum availability, String name) {
        super(context, apiKey);
        this.styleId = styleId;
        this.availability = availability;
        this.name = name;
    }

    public EnginesClient(Context context, String apiKey, Integer styleId, AvailabilityEnum availability) {
        this(context, apiKey, styleId, availability, null);
    }

    public EnginesClient(Context context, String apiKey, Integer styleId) {
        this(context, apiKey, styleId, null, null);
    }

    @Override
    protected void executeService(VehicleService service) {
        service.engines(styleId, availability, name, this);
    }
}
