package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TransmissionDTO extends EquipmentDTO {

    @SerializedName("automaticType")
    private String automaticType;

    @SerializedName("transmissionType")
    private String transmissionType;

    @SerializedName("numberOfSpeeds")
    private String numberOfSpeeds;

    @SerializedName("options")
    private List<OptionDTO> options;

    public String getAutomaticType() {
        return automaticType;
    }

    public void setAutomaticType(String automaticType) {
        this.automaticType = automaticType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getNumberOfSpeeds() {
        return numberOfSpeeds;
    }

    public void setNumberOfSpeeds(String numberOfSpeeds) {
        this.numberOfSpeeds = numberOfSpeeds;
    }

    public List<OptionDTO> getOptions() {
        return options;
    }

    public void setOptions(List<OptionDTO> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append("<" + super.toString() + ">");
        sb.append(", automaticType: " + automaticType);
        sb.append(", transmissionType: " + transmissionType);
        sb.append(", numberOfSpeeds: " + numberOfSpeeds);
        sb.append(", options: " + options);
        sb.append("]");
        return sb.toString();
    }

}
