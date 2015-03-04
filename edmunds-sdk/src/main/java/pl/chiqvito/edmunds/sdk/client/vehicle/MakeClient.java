package pl.chiqvito.edmunds.sdk.client.vehicle;

import android.content.Context;

import pl.chiqvito.edmunds.sdk.dto.enums.StateEnum;
import pl.chiqvito.edmunds.sdk.dto.enums.ViewTypeEnum;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.MakeDTO;
import pl.chiqvito.edmunds.sdk.service.VehicleService;

public class MakeClient extends BaseMakesClient<MakeDTO> {

    private final String make;

    public MakeClient(Context context, String apiKey, String make, StateEnum state, Integer year, ViewTypeEnum view) {
        super(context, apiKey, state, year, view);
        this.make = make;
    }

    public MakeClient(Context context, String apiKey, String make) {
        this(context, apiKey, make, null, null, null);
    }

    public MakeClient(Context context, String apiKey, String make, StateEnum state) {
        this(context, apiKey, make, state, null, null);
    }

    public MakeClient(Context context, String apiKey, String make, Integer year) {
        this(context, apiKey, make, null, year, null);
    }

    public MakeClient(Context context, String apiKey, String make, ViewTypeEnum view) {
        this(context, apiKey, make, null, null, view);
    }

    @Override
    protected void executeService(VehicleService service) {
        service.make(make, state, year, view, this);
    }

}
