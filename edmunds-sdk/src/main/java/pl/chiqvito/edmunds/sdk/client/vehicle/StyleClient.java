package pl.chiqvito.edmunds.sdk.client.vehicle;

import android.content.Context;

import pl.chiqvito.edmunds.sdk.dto.enums.ViewTypeEnum;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.StyleDTO;
import pl.chiqvito.edmunds.sdk.service.VehicleService;

public class StyleClient extends BaseStylesClient<StyleDTO> {

    private final Integer id;

    public StyleClient(Context context, String apiKey, Integer id, ViewTypeEnum view) {
        super(context, apiKey, null, null, null, null, view);
        this.id = id;
    }

    public StyleClient(Context context, String apiKey, Integer id) {
        super(context, apiKey, null, null, null, null, null);
        this.id = id;
    }

    @Override
    protected void executeService(VehicleService service) {
        service.styles(id, view, this);
    }

}
