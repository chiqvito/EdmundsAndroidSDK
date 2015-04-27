package pl.chiqvito.edmunds.sdk.dto.enums;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public enum OptionCategoryEnum implements Parcelable {
    @SerializedName("Interior")
    INTERIOR,
    @SerializedName("Exterior")
    EXTERIOR,
    @SerializedName("Roof")
    ROOF,
    @SerializedName("Interior Trim")
    INTERIOR_TRIM,
    @SerializedName("Mechanical")
    MECHANICAL,
    @SerializedName("Package")
    PACKAGE,
    @SerializedName("Additional Fees")
    ADDITIONAL_FEES,
    @SerializedName("Other")
    OTHER;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

    public static final Parcelable.Creator<OptionCategoryEnum> CREATOR = new Parcelable.Creator<OptionCategoryEnum>() {
        public OptionCategoryEnum createFromParcel(Parcel in) {
            String value = in.readString();
            if (value != null)
                return OptionCategoryEnum.valueOf(value);
            return null;
        }

        public OptionCategoryEnum[] newArray(int size) {
            return new OptionCategoryEnum[size];
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