package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class YearsDTO {

    @SerializedName("years")
    private List<YearDTO> years;

    @SerializedName("yearsCount")
    private Integer yearsCount;

    public List<YearDTO> getYears() {
        return years;
    }

    public void setYears(List<YearDTO> years) {
        this.years = years;
    }

    public Integer getYearsCount() {
        return yearsCount;
    }

    public void setYearsCount(Integer yearsCount) {
        this.yearsCount = yearsCount;
    }

}
