package pl.chiqvito.edmunds.sdk.client.media;

import android.content.Context;

import pl.chiqvito.edmunds.sdk.dto.media.response.PhotosDTO;
import pl.chiqvito.edmunds.sdk.service.MediaService;

public class PhotosClient extends BaseMediaClient<PhotosDTO> {

    protected final String make;
    protected final String model;
    protected final Integer year;

    public PhotosClient(Context context, String apiKey, String make, String model, Integer year) {
        super(context, apiKey);
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    protected void executeService(MediaService service) {
        service.photos(make, model, year, this);
    }

}
