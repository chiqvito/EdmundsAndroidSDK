package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ModelsDTO {

    @SerializedName("models")
    private List<ModelDTO> models;

    @SerializedName("modelsCount")
    private Integer modelsCount;

    public List<ModelDTO> getModels() {
        return models;
    }

    public void setModels(List<ModelDTO> models) {
        this.models = models;
    }

    public Integer getModelsCount() {
        return modelsCount;
    }

    public void setModelsCount(Integer modelsCount) {
        this.modelsCount = modelsCount;
    }

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
