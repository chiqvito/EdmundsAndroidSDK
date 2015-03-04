package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import pl.chiqvito.edmunds.sdk.dto.enums.StateEnum;

public class YearDTO {

    @SerializedName("id")
    private Integer id;

    @SerializedName("states")
    private List<StateEnum> states;

    @SerializedName("styles")
    private List<StyleDTO> styles;

    @SerializedName("year")
    private Integer year;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<StateEnum> getStates() {
        return states;
    }

    public void setStates(List<StateEnum> states) {
        this.states = states;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public List<StyleDTO> getStyles() {
        return styles;
    }

    public void setStyles(List<StyleDTO> styles) {
        this.styles = styles;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append(" id: " + id);
        sb.append(", states: " + states);
        sb.append(", styles: " + styles);
        sb.append(", year: " + year);
        sb.append("]");
        return sb.toString();
    }

}
