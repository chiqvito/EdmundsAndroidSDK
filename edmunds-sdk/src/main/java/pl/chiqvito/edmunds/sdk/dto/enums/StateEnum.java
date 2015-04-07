package pl.chiqvito.edmunds.sdk.dto.enums;

import android.os.Parcel;
import android.os.Parcelable;

public enum StateEnum implements Parcelable {
    NEW, USED, FUTURE;

    public static final Parcelable.Creator<StateEnum> CREATOR = new Parcelable.Creator<StateEnum>() {
        public StateEnum createFromParcel(Parcel in) {
            String value = in.readString();
            if (value != null)
                return StateEnum.valueOf(value);
            return null;
        }

        public StateEnum[] newArray(int size) {
            return new StateEnum[size];
        }
    };

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
