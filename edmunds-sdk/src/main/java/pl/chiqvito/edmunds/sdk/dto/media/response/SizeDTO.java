package pl.chiqvito.edmunds.sdk.dto.media.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class SizeDTO implements Parcelable {

    public static final Parcelable.Creator<SizeDTO> CREATOR = new Parcelable.Creator<SizeDTO>() {
        public SizeDTO createFromParcel(Parcel in) {
            return new SizeDTO(in);
        }

        public SizeDTO[] newArray(int size) {
            return new SizeDTO[size];
        }
    };

    @SerializedName("width")
    private Integer width;

    @SerializedName("height")
    private Integer height;

    public SizeDTO() {
    }

    private SizeDTO(Parcel in) {
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        width = (Integer) in.readValue(Integer.class.getClassLoader());
        height = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(width);
        dest.writeValue(height);
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
