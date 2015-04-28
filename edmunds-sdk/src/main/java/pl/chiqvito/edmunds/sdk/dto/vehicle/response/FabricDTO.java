package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class FabricDTO implements Parcelable {

    public static final Parcelable.Creator<FabricDTO> CREATOR = new Parcelable.Creator<FabricDTO>() {
        public FabricDTO createFromParcel(Parcel in) {
            return new FabricDTO(in);
        }

        public FabricDTO[] newArray(int size) {
            return new FabricDTO[size];
        }
    };

    @SerializedName("name")
    private String name;

    @SerializedName("value")
    private String value;

    public FabricDTO() {
    }

    protected FabricDTO(Parcel in) {
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        name = (String) in.readValue(String.class.getClassLoader());
        value = (String) in.readValue(String.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(name);
        dest.writeValue(value);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append(" name: " + name);
        sb.append(", value: " + value);
        sb.append("]");
        return sb.toString();
    }

}
