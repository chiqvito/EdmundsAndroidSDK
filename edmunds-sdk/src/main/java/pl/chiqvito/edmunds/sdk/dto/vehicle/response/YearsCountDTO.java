package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class YearsCountDTO {

    @SerializedName("yearsCount")
    private Integer yearsCount;

    @SerializedName("years")
    private List<YearCountDTO> years;

    public Integer getYearsCount() {
        return yearsCount;
    }

    public void setYearsCount(Integer yearsCount) {
        this.yearsCount = yearsCount;
    }

    public List<YearCountDTO> getYears() {
        return years;
    }

    public void setYears(List<YearCountDTO> years) {
        this.years = years;
    }

}
