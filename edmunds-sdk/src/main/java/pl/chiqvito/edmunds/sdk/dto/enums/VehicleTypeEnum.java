package pl.chiqvito.edmunds.sdk.dto.enums;

import com.google.gson.annotations.SerializedName;

public enum VehicleTypeEnum {
    @SerializedName("Car")
    CAR,
    @SerializedName("Truck")
    TRUCK,
    @SerializedName("SUV")
    SUV,
    @SerializedName("Van")
    VAN,
    @SerializedName("Minivan")
    MINIVAN;
}
