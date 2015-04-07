package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class MPGDTO implements Parcelable {

    public static final Parcelable.Creator<MPGDTO> CREATOR = new Parcelable.Creator<MPGDTO>() {
        public MPGDTO createFromParcel(Parcel in) {
            return new MPGDTO(in);
        }

        public MPGDTO[] newArray(int size) {
            return new MPGDTO[size];
        }
    };

    @SerializedName("highway")
    private Integer highway;

    @SerializedName("city")
    private Integer city;

    public MPGDTO() {
    }

    private MPGDTO(Parcel in) {
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        highway = (Integer) in.readValue(Integer.class.getClassLoader());
        city = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(highway);
        dest.writeValue(city);
    }

    public Integer getHighway() {
        return highway;
    }

    public void setHighway(Integer highway) {
        this.highway = highway;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append(" highway: " + highway);
        sb.append(", city: " + city);
        sb.append("]");
        return sb.toString();
    }

}
