package pl.chiqvito.edmunds.sdk.service;

import pl.chiqvito.edmunds.sdk.dto.media.response.PhotosDTO;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

public interface MediaService {

    @GET("/api/media/v2/{make}/{model}/{year}/photos")
    void photos(@Path("make") String make, @Path("model") String model, @Path("year") Integer year, Callback<PhotosDTO> callback);

}
