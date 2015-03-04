package pl.chiqvito.edmunds.sdk.client.vehicle;

import android.content.Context;

import pl.chiqvito.edmunds.sdk.dto.enums.StateEnum;
import pl.chiqvito.edmunds.sdk.dto.enums.ViewTypeEnum;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.MakesCountDTO;
import pl.chiqvito.edmunds.sdk.service.VehicleService;

public class MakesCountClient extends BaseMakesClient<MakesCountDTO> {

    public MakesCountClient(Context context, String apiKey, StateEnum state, Integer year, ViewTypeEnum view) {
        super(context, apiKey, state, year, view);
    }

    public MakesCountClient(Context context, String apiKey) {
        this(context, apiKey, null, null, null);
    }

    public MakesCountClient(Context context, String apiKey, StateEnum state) {
        this(context, apiKey, state, null, null);
    }

    public MakesCountClient(Context context, String apiKey, Integer year) {
        this(context, apiKey, null, year, null);
    }

    public MakesCountClient(Context context, String apiKey, ViewTypeEnum view) {
        this(context, apiKey, null, null, view);
    }

    @Override
    protected void executeService(VehicleService service) {
        service.makesCount(state, year, view, this);
    }

}
