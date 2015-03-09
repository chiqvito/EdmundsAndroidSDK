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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append(" stylesCount: " + stylesCount);
        sb.append("]");
        return sb.toString();
    }

}
