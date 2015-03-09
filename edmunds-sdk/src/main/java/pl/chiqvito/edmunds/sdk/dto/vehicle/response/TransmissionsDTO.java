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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append(" transmissionsCount: " + transmissionsCount);
        sb.append(", transmissions: " + transmissions);
        sb.append("]");
        return sb.toString();
    }

}
