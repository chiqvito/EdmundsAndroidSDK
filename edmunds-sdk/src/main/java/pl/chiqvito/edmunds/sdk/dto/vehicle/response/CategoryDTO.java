package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import pl.chiqvito.edmunds.sdk.dto.enums.VehicleSizeEnum;
import pl.chiqvito.edmunds.sdk.dto.enums.VehicleTypeEnum;

public class CategoryDTO implements Parcelable {

    public static final Parcelable.Creator<CategoryDTO> CREATOR = new Parcelable.Creator<CategoryDTO>() {
        public CategoryDTO createFromParcel(Parcel in) {
            return new CategoryDTO(in);
        }

        public CategoryDTO[] newArray(int size) {
            return new CategoryDTO[size];
        }
    };

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

    public CategoryDTO() {
    }

    private CategoryDTO(Parcel in) {
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        epaClass = (String) in.readValue(String.class.getClassLoader());
        vehicleSize = in.readParcelable(VehicleSizeEnum.class.getClassLoader());
        primaryBodyType = (String) in.readValue(String.class.getClassLoader());
        vehicleStyle = (String) in.readValue(String.class.getClassLoader());
        vehicleType = in.readParcelable(VehicleTypeEnum.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(epaClass);
        dest.writeParcelable(vehicleSize, flags);
        dest.writeValue(primaryBodyType);
        dest.writeValue(vehicleStyle);
        dest.writeParcelable(vehicleType, flags);
    }

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
