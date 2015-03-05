package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

import pl.chiqvito.edmunds.sdk.dto.enums.VehicleSizeEnum;
import pl.chiqvito.edmunds.sdk.dto.enums.VehicleTypeEnum;

public class CategoryDTO {

    @SerializedName("EPAClass")
    private String epaClass;

    @SerializedName("vehicleSize")
    private VehicleSizeEnum vehicleSize;

    @SerializedName("primaryBodyType")
    private String primaryBodyType;

    @SerializedName("vehicleStyle")
    private String vehicleStyle;

    @SerializedName("vehicleType")
    private VehicleTypeEnum vehicleType;

    public String getEpaClass() {
        return epaClass;
    }

    public void setEpaClass(String epaClass) {
        this.epaClass = epaClass;
    }

    public VehicleSizeEnum getVehicleSize() {
        return vehicleSize;
    }

    public void setVehicleSize(VehicleSizeEnum vehicleSize) {
        this.vehicleSize = vehicleSize;
    }

    public String getPrimaryBodyType() {
        return primaryBodyType;
    }

    public void setPrimaryBodyType(String primaryBodyType) {
        this.primaryBodyType = primaryBodyType;
    }

    public String getVehicleStyle() {
        return vehicleStyle;
    }

    public void setVehicleStyle(String vehicleStyle) {
        this.vehicleStyle = vehicleStyle;
    }

    public VehicleTypeEnum getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleTypeEnum vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append(" epaClass: " + epaClass);
        sb.append(", vehicleSize: " + vehicleSize);
        sb.append(", primaryBodyType: " + primaryBodyType);
        sb.append(", vehicleStyle: " + vehicleStyle);
        sb.append(", vehicleType: " + vehicleType);
        sb.append("]");
        return sb.toString();
    }

}
