package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OptionColorsDTO {

    @SerializedName("colorsCount")
    private Integer colorsCount;

    @SerializedName("colors")
    private List<OptionColorDTO> colors;

    public Integer getColorsCount() {
        return colorsCount;
    }

    public void setColorsCount(Integer colorsCount) {
        this.colorsCount = colorsCount;
    }

    public List<OptionColorDTO> getColors() {
        return colors;
    }

    public void setColors(List<OptionColorDTO> colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append(" colorsCount: " + colorsCount);
        sb.append(", colors: " + colors);
        sb.append("]");
        return sb.toString();
    }

}
