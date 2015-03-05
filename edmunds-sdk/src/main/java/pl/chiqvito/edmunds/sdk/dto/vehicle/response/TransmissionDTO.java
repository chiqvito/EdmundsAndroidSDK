package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

public class TransmissionDTO {

    private String id;
    private String name;
    private String automaticType;
    private String transmissionType;
    private String numberOfSpeeds;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append(" id: " + id);
        sb.append(", name: " + name);
        sb.append(", automaticType: " + automaticType);
        sb.append(", transmissionType: " + transmissionType);
        sb.append(", numberOfSpeeds: " + numberOfSpeeds);
        sb.append("]");
        return sb.toString();
    }

}
