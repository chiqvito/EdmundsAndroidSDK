package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

public class MakeCountDTO {

    @SerializedName("modelsCount")
    private Integer modelsCount;

    @SerializedName("niceName")
    private String niceName;

    public Integer getModelsCount() {
        return modelsCount;
    }

    public void setModelsCount(Integer modelsCount) {
        this.modelsCount = modelsCount;
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
        sb.append(" modelsCount: " + modelsCount);
        sb.append(", niceName: " + niceName);
        sb.append("]");
        return sb.toString();
    }

}
