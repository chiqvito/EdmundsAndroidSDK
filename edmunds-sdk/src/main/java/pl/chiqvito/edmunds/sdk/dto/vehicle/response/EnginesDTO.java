package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EnginesDTO {

    @SerializedName("enginesCount")
    private Integer enginesCount;

    @SerializedName("engines")
    private List<EngineDTO> engines;

    public Integer getEnginesCount() {
        return enginesCount;
    }

    public void setEnginesCount(Integer enginesCount) {
        this.enginesCount = enginesCount;
    }

    public List<EngineDTO> getEngines() {
        return engines;
    }

    public void setEngines(List<EngineDTO> engines) {
        this.engines = engines;
    }

}
