package pl.chiqvito.edmunds.sdk.dto.enums;

import com.google.gson.annotations.SerializedName;

public enum OptionCategoryEnum {
    @SerializedName("Interior")
    INTERIOR,
    @SerializedName("Exterior")
    EXTERIOR,
    @SerializedName("Roof")
    ROOF,
    @SerializedName("Interior Trim")
    INTERIOR_TRIM,
    @SerializedName("Mechanical")
    MECHANICAL,
    @SerializedName("Package")
    PACKAGE,
    @SerializedName("Additional Fees")
    ADDITIONAL_FEES,
    @SerializedName("Other")
    OTHER;
}