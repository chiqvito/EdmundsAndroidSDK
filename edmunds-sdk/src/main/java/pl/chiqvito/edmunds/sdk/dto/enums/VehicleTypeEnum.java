package pl.chiqvito.edmunds.sdk.dto.enums;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public enum VehicleTypeEnum implements Parcelable {
    @SerializedName("Car")
    CAR,
    @SerializedName("Truck")
    TRUCK,
    @SerializedName("SUV")
    SUV,
    @SerializedName("Van")
    VAN,
    @SerializedName("Minivan")
    MINIVAN;

    public static final Parcelable.Creator<VehicleTypeEnum> CREATOR = new Parcelable.Creator<VehicleTypeEnum>() {
        public VehicleTypeEnum createFromParcel(Parcel in) {
            String value = in.readString();
            if (value != null)
                return VehicleTypeEnum.valueOf(value);
            return null;
        }

        public VehicleTypeEnum[] newArray(int size) {
            return new VehicleTypeEnum[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name());
    }
}
