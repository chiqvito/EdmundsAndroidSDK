package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ModelsDTO {

    @SerializedName("models")
    private List<ModelDTO> models;

    @SerializedName("modelsCount")
    private Integer modelsCount;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append(" modelsCount: " + modelsCount);
        sb.append(", models: " + models);
        sb.append("]");
        return sb.toString();
    }

}
