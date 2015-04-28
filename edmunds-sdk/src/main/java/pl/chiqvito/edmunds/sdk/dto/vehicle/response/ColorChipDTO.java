package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class ColorChipDTO implements Parcelable {

    public static final Parcelable.Creator<ColorChipDTO> CREATOR = new Parcelable.Creator<ColorChipDTO>() {
        public ColorChipDTO createFromParcel(Parcel in) {
            return new ColorChipDTO(in);
        }

        public ColorChipDTO[] newArray(int size) {
            return new ColorChipDTO[size];
        }
    };

    @SerializedName("primary")
    private ColorDTO primary;

    public ColorChipDTO() {
    }

    protected ColorChipDTO(Parcel in) {
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        primary = in.readParcelable(ColorDTO.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(primary, flags);
    }

    public ColorDTO getPrimary() {
        return primary;
    }

    public void setPrimary(ColorDTO primary) {
        this.primary = primary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append(" primary: " + primary);
        sb.append("]");
        return sb.toString();
    }

}
