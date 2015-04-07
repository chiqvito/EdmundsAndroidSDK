package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import pl.chiqvito.edmunds.sdk.dto.enums.AvailabilityEnum;
import pl.chiqvito.edmunds.sdk.dto.enums.EquipmentTypeEnum;

public class EquipmentDTO implements Parcelable {

    public static final Parcelable.Creator<EquipmentDTO> CREATOR = new Parcelable.Creator<EquipmentDTO>() {
        public EquipmentDTO createFromParcel(Parcel in) {
            return new EquipmentDTO(in);
        }

        public EquipmentDTO[] newArray(int size) {
            return new EquipmentDTO[size];
        }
    };

    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("equipmentType")
    private EquipmentTypeEnum equipmentType;

    @SerializedName("availability")
    private AvailabilityEnum availability;

    public EquipmentDTO() {
    }

    protected EquipmentDTO(Parcel in) {
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        id = (String) in.readValue(String.class.getClassLoader());
        name = (String) in.readValue(String.class.getClassLoader());
        equipmentType = in.readParcelable(EquipmentTypeEnum.class.getClassLoader());
        availability = in.readParcelable(AvailabilityEnum.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(name);
        dest.writeParcelable(equipmentType, flags);
        dest.writeParcelable(availability, flags);
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append(" id: " + id);
        sb.append(", name: " + name);
        sb.append(", equipmentType: " + equipmentType);
        sb.append(", availability: " + availability);
        sb.append("]");
        return sb.toString();
    }

}
