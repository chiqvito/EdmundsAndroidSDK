package pl.chiqvito.edmunds.sdk.client.vehicle;

import android.content.Context;

import pl.chiqvito.edmunds.sdk.dto.enums.OptionCategoryEnum;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.OptionColorsDTO;
import pl.chiqvito.edmunds.sdk.service.VehicleService;

public class ColorsClient extends BaseVehicleClient<OptionColorsDTO> {

    private final Integer styleId;
    private OptionCategoryEnum category;

    public ColorsClient(Context context, String apiKey, Integer styleId, OptionCategoryEnum category) {
        super(context, apiKey);
        this.styleId = styleId;
        this.category = category;
    }

    public ColorsClient(Context context, String apiKey, Integer styleId) {
        super(context, apiKey);
        this.styleId = styleId;
    }

    @Override
    protected void executeService(VehicleService service) {
        service.colors(styleId, category, this);
    }
}
