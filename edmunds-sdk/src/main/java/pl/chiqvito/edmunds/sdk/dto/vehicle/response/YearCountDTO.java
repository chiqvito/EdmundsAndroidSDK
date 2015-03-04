package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

public class YearCountDTO {

    @SerializedName("id")
    private Integer id;

    @SerializedName("stylesCount")
    private Integer stylesCount;

    @SerializedName("year")
    private Integer year;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStylesCount() {
        return stylesCount;
    }

    public void setStylesCount(Integer stylesCount) {
        this.stylesCount = stylesCount;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append(" id: " + id);
        sb.append(", stylesCount: " + stylesCount);
        sb.append(", year: " + year);
        sb.append("]");
        return sb.toString();
    }

}
