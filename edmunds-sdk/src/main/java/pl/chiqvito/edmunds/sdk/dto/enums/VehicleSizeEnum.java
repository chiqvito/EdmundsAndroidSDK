package pl.chiqvito.edmunds.sdk.dto.enums;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public enum VehicleSizeEnum implements Parcelable {
    @SerializedName("Compact")
    COMPACT,
    @SerializedName("Midsize")
    MIDSIZE,
    @SerializedName("Large")
    LARGE;

    public static final Parcelable.Creator<VehicleSizeEnum> CREATOR = new Parcelable.Creator<VehicleSizeEnum>() {
        public VehicleSizeEnum createFromParcel(Parcel in) {
            String value = in.readString();
            if (value != null)
                return VehicleSizeEnum.valueOf(value);
            return null;
        }

        public VehicleSizeEnum[] newArray(int size) {
            return new VehicleSizeEnum[size];
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
