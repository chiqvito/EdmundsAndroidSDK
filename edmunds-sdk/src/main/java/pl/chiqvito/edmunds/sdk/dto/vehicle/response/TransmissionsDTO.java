package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TransmissionsDTO {

    @SerializedName("transmissionsCount")
    private Integer transmissionsCount;

    @SerializedName("transmissions")
    private List<TransmissionDTO> transmissions;

    public Integer getTransmissionsCount() {
        return transmissionsCount;
    }

    public void setTransmissionsCount(Integer transmissionsCount) {
        this.transmissionsCount = transmissionsCount;
    }

    public List<TransmissionDTO> getTransmissions() {
        return transmissions;
    }

    public void setTransmissions(List<TransmissionDTO> transmissions) {
        this.transmissions = transmissions;
    }

}
