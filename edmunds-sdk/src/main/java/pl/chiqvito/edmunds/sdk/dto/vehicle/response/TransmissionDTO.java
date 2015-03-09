package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import pl.chiqvito.edmunds.sdk.dto.enums.AvailabilityEnum;
import pl.chiqvito.edmunds.sdk.dto.enums.EquipmentTypeEnum;

public class TransmissionDTO {

    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("equipmentType")
    private EquipmentTypeEnum equipmentType;

    @SerializedName("availability")
    private AvailabilityEnum availability;

    @SerializedName("automaticType")
    private String automaticType;

    @SerializedName("transmissionType")
    private String transmissionType;

    @SerializedName("numberOfSpeeds")
    private String numberOfSpeeds;

    @SerializedName("options")
    private List<OptionDTO> options;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public EquipmentTypeEnum getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(EquipmentTypeEnum equipmentType) {
        this.equipmentType = equipmentType;
    }

    public AvailabilityEnum getAvailability() {
        return availability;
    }

    public void setAvailability(AvailabilityEnum availability) {
        this.availability = availability;
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
        sb.append(" id: " + id);
        sb.append(", name: " + name);
        sb.append(", equipmentType: " + equipmentType);
        sb.append(", availability: " + availability);
        sb.append(", automaticType: " + automaticType);
        sb.append(", transmissionType: " + transmissionType);
        sb.append(", numberOfSpeeds: " + numberOfSpeeds);
        sb.append(", options: " + options);
        sb.append("]");
        return sb.toString();
    }

}
