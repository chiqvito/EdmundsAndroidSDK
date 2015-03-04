package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

public class ModelCountDTO {

    @SerializedName("yearsCount")
    private Integer yearsCount;

    @SerializedName("niceName")
    private String niceName;

    public Integer getYearsCount() {
        return yearsCount;
    }

    public void setYearsCount(Integer yearsCount) {
        this.yearsCount = yearsCount;
    }

    public String getNiceName() {
        return niceName;
    }

    public void setNiceName(String niceName) {
        this.niceName = niceName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append(" yearsCount: " + yearsCount);
        sb.append(", niceName: " + niceName);
        sb.append("]");
        return sb.toString();
    }

}
