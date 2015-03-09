package pl.chiqvito.edmunds.sdk.dto.enums;

import com.google.gson.annotations.SerializedName;

public enum AvailabilityEnum {
    @SerializedName("Standard")
    STANDARD,
    @SerializedName("Optional")
    OPTIONAL;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
