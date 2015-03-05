package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

public class EngineDTO {

    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("compressionRatio")
    private Float compressionRatio;

    @SerializedName("cylinder")
    private Integer cylinder;

    @SerializedName("size")
    private Float size;

    @SerializedName("displacement")
    private Integer displacement;

    @SerializedName("configuration")
    private String configuration;

    @SerializedName("fuelType")
    private String fuelType;

    @SerializedName("horsepower")
    private Integer horsepower;

    @SerializedName("torque")
    private Integer torque;

    @SerializedName("totalValves")
    private Integer totalValves;

    @SerializedName("manufacturerEngineCode")
    private String manufacturerEngineCode;

    @SerializedName("type")
    private String type;

    @SerializedName("code")
    private String code;

    @SerializedName("compressorType")
    private String compressorType;

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

    public Float getCompressionRatio() {
        return compressionRatio;
    }

    public void setCompressionRatio(Float compressionRatio) {
        this.compressionRatio = compressionRatio;
    }

    public Integer getCylinder() {
        return cylinder;
    }

    public void setCylinder(Integer cylinder) {
        this.cylinder = cylinder;
    }

    public Float getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    public Integer getDisplacement() {
        return displacement;
    }

    public void setDisplacement(Integer displacement) {
        this.displacement = displacement;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Integer getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(Integer horsepower) {
        this.horsepower = horsepower;
    }

    public Integer getTorque() {
        return torque;
    }

    public void setTorque(Integer torque) {
        this.torque = torque;
    }

    public Integer getTotalValves() {
        return totalValves;
    }

    public void setTotalValves(Integer totalValves) {
        this.totalValves = totalValves;
    }

    public String getManufacturerEngineCode() {
        return manufacturerEngineCode;
    }

    public void setManufacturerEngineCode(String manufacturerEngineCode) {
        this.manufacturerEngineCode = manufacturerEngineCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCompressorType() {
        return compressorType;
    }

    public void setCompressorType(String compressorType) {
        this.compressorType = compressorType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append(" id: " + id);
        sb.append(", name: " + name);
        sb.append(", compressionRatio: " + compressionRatio);
        sb.append(", cylinder: " + cylinder);
        sb.append(", size: " + size);
        sb.append(", displacement: " + displacement);
        sb.append(", configuration: " + configuration);
        sb.append(", fuelType: " + fuelType);
        sb.append(", horsepower: " + horsepower);
        sb.append(", torque: " + torque);
        sb.append(", totalValves: " + totalValves);
        sb.append(", manufacturerEngineCode: " + manufacturerEngineCode);
        sb.append(", type: " + type);
        sb.append(", code: " + code);
        sb.append(", compressorType: " + compressorType);
        sb.append("]");
        return sb.toString();
    }

}
