package pl.chiqvito.edmunds.sdk.service;

import pl.chiqvito.edmunds.sdk.dto.enums.StateEnum;
import pl.chiqvito.edmunds.sdk.dto.enums.ViewTypeEnum;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.MakeDTO;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.MakesCountDTO;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.MakesDTO;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.ModelDTO;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.ModelsCountDTO;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.ModelsDTO;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

public interface VehicleService {

    @GET("/api/vehicle/v2/makes")
    void makes(@Query("state") StateEnum state, @Query("year") Integer year, @Query("view") ViewTypeEnum view, Callback<MakesDTO> callback);

    @GET("/api/vehicle/v2/makes/count")
    void makesCount(@Query("state") StateEnum state, @Query("year") Integer year, @Query("view") ViewTypeEnum view, Callback<MakesCountDTO> callback);

    @GET("/api/vehicle/v2/{make}")
    void make(@Path("make") String make, @Query("state") StateEnum state, @Query("year") Integer year, @Query("view") ViewTypeEnum view, Callback<MakeDTO> callback);

    @GET("/api/vehicle/v2/{make}/models")
    void models(@Path("make") String make, @Query("state") StateEnum state, @Query("year") Integer year, @Query("view") ViewTypeEnum view, Callback<ModelsDTO> callback);

    @GET("/api/vehicle/v2/{make}/models/count")
    void modelsCount(@Path("make") String make, @Query("state") StateEnum state, @Query("year") Integer year, @Query("view") ViewTypeEnum view, Callback<ModelsCountDTO> callback);

    @GET("/api/vehicle/v2/{make}/{model}")
    void model(@Path("make") String make, @Path("model") String model, @Query("state") StateEnum state, @Query("year") Integer year, @Query("view") ViewTypeEnum view, Callback<ModelDTO> callback);

}
