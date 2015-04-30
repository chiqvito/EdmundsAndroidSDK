package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

public class StylesCountDTO {

    @SerializedName("stylesCount")
    private Integer stylesCount;

    public Integer getStylesCount() {
        return stylesCount;
    }

    public void setStylesCount(Integer stylesCount) {
        this.stylesCount = stylesCount;
    }

}
