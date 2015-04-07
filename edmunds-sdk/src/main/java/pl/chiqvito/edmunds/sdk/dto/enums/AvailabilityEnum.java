package pl.chiqvito.edmunds.sdk.dto.enums;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public enum AvailabilityEnum implements Parcelable {
    @SerializedName("Standard")
    STANDARD,
    @SerializedName("Optional")
    OPTIONAL;

    public static final Parcelable.Creator<AvailabilityEnum> CREATOR = new Parcelable.Creator<AvailabilityEnum>() {
        public AvailabilityEnum createFromParcel(Parcel in) {
            String value = in.readString();
            if (value != null)
                return AvailabilityEnum.valueOf(value);
            return null;
        }

        public AvailabilityEnum[] newArray(int size) {
            return new AvailabilityEnum[size];
        }
    };

    @Override
    public String toString() {
        return name().toLowerCase();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name());
    }
}
