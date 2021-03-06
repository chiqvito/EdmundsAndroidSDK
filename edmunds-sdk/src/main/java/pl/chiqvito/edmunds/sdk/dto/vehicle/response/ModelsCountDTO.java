package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ModelsCountDTO {

    @SerializedName("modelsCount")
    private Integer modelsCount;

    @SerializedName("models")
    private List<ModelCountDTO> models;

    public Integer getModelsCount() {
        return modelsCount;
    }

    public void setModelsCount(Integer modelsCount) {
        this.modelsCount = modelsCount;
    }

    public List<ModelCountDTO> getModels() {
        return models;
    }

    public void setModels(List<ModelCountDTO> models) {
        this.models = models;
    }

}
