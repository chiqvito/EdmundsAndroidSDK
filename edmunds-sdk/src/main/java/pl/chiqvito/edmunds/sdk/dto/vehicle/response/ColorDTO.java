package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class ColorDTO implements Parcelable {

    public static final Parcelable.Creator<ColorDTO> CREATOR = new Parcelable.Creator<ColorDTO>() {
        public ColorDTO createFromParcel(Parcel in) {
            return new ColorDTO(in);
        }

        public ColorDTO[] newArray(int size) {
            return new ColorDTO[size];
        }
    };

    @SerializedName("r")
    private Integer r;

    @SerializedName("g")
    private Integer g;

    @SerializedName("b")
    private Integer b;

    @SerializedName("hex")
    private String hex;

    public ColorDTO() {
    }

    protected ColorDTO(Parcel in) {
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        r = (Integer) in.readValue(Integer.class.getClassLoader());
        g = (Integer) in.readValue(Integer.class.getClassLoader());
        b = (Integer) in.readValue(Integer.class.getClassLoader());
        hex = (String) in.readValue(String.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(r);
        dest.writeValue(g);
        dest.writeValue(b);
        dest.writeValue(hex);
    }

    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }

    public Integer getG() {
        return g;
    }

    public void setG(Integer g) {
        this.g = g;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

}
