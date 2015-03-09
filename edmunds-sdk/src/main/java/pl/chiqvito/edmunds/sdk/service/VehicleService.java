package pl.chiqvito.edmunds.sdk.service;

import pl.chiqvito.edmunds.sdk.dto.enums.StateEnum;
import pl.chiqvito.edmunds.sdk.dto.enums.ViewTypeEnum;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.MakeDTO;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.MakesCountDTO;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.MakesDTO;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.ModelDTO;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.ModelsCountDTO;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.ModelsDTO;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.StylesCountDTO;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.StylesDTO;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.YearDTO;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.YearsCountDTO;
import pl.chiqvito.edmunds.sdk.dto.vehicle.response.YearsDTO;
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

    @GET("/api/vehicle/v2/{make}/{model}/years")
    void modelYears(@Path("make") String make, @Path("model") String model, @Query("state") StateEnum state, @Query("view") ViewTypeEnum view, Callback<YearsDTO> callback);

    @GET("/api/vehicle/v2/{make}/{model}/years/count")
    void modelYearsCount(@Path("make") String make, @Path("model") String model, @Query("state") StateEnum state, @Query("view") ViewTypeEnum view, Callback<YearsCountDTO> callback);

    @GET("/api/vehicle/v2/{make}/{model}/{year}")
    void modelYear(@Path("make") String make, @Path("model") String model, @Path("year") Integer year, @Query("state") StateEnum state, @Query("view") ViewTypeEnum view, Callback<YearDTO> callback);

    @GET("/api/vehicle/v2/{make}/{model}/{year}/styles")
    void styles(@Path("make") String make, @Path("model") String model, @Path("year") Integer year, @Query("state") StateEnum state, @Query("view") ViewTypeEnum view, Callback<StylesDTO> callback);

    @GET("/api/vehicle/v2/{make}/{model}/{year}/styles/count")
    void stylesCount(@Path("make") String make, @Path("model") String model, @Path("year") Integer year, @Query("state") StateEnum state, Callback<StylesCountDTO> callback);

    @GET("/api/vehicle/v2/{make}/{model}/styles/count")
    void stylesCount(@Path("make") String make, @Path("model") String model, @Query("state") StateEnum state, Callback<StylesCountDTO> callback);

    @GET("/api/vehicle/v2/{make}/styles/count")
    void stylesCount(@Path("make") String make, @Query("state") StateEnum state, Callback<StylesCountDTO> callback);

    @GET("/api/vehicle/v2/styles/count")
    void stylesCount(@Query("state") StateEnum state, Callback<StylesCountDTO> callback);

}
