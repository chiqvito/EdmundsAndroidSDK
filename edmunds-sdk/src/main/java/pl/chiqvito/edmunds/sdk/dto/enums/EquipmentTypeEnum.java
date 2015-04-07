package pl.chiqvito.edmunds.sdk.dto.enums;

import android.os.Parcel;
import android.os.Parcelable;

public enum EquipmentTypeEnum implements Parcelable {
    AUDIO_SYSTEM,
    COLOR,
    ENGINE,
    TRANSMISSION,
    MANUFACTURER,
    MIRRORS,
    OPTION,
    OTHER,
    TELEMATICS,
    TIRES;

    public static final Parcelable.Creator<EquipmentTypeEnum> CREATOR = new Parcelable.Creator<EquipmentTypeEnum>() {
        public EquipmentTypeEnum createFromParcel(Parcel in) {
            String value = in.readString();
            if (value != null)
                return EquipmentTypeEnum.valueOf(value);
            return null;
        }

        public EquipmentTypeEnum[] newArray(int size) {
            return new EquipmentTypeEnum[size];
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
