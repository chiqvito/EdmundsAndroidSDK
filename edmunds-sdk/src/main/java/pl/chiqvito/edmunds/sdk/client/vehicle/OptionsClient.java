package pl.chiqvito.edmunds.sdk.client.vehicle;

import android.content.Context;

import pl.chiqvito.edmunds.sdk.dto.enums.OptionCategoryEnum;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.OptionsDTO;
import pl.chiqvito.edmunds.sdk.service.VehicleService;

public class OptionsClient extends BaseVehicleClient<OptionsDTO> {

    private final Integer styleId;
    private OptionCategoryEnum category;

    public OptionsClient(Context context, String apiKey, Integer styleId, OptionCategoryEnum category) {
        super(context, apiKey);
        this.styleId = styleId;
        this.category = category;
    }

    public OptionsClient(Context context, String apiKey, Integer styleId) {
        this(context, apiKey, styleId, null);
    }

    @Override
    protected void executeService(VehicleService service) {
        service.options(styleId, category, this);
    }
}
