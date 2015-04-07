package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class SubModelDTO implements Parcelable {

    public static final Parcelable.Creator<SubModelDTO> CREATOR = new Parcelable.Creator<SubModelDTO>() {
        public SubModelDTO createFromParcel(Parcel in) {
            return new SubModelDTO(in);
        }

        public SubModelDTO[] newArray(int size) {
            return new SubModelDTO[size];
        }
    };

    @SerializedName("modelName")
    private String modelName;

    @SerializedName("niceName")
    private String niceName;

    @SerializedName("body")
    private String body;

    @SerializedName("fuel")
    private String fuel;

    @SerializedName("tuner")
    private String tuner;

    public SubModelDTO() {
    }

    private SubModelDTO(Parcel in) {
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        modelName = (String) in.readValue(String.class.getClassLoader());
        niceName = (String) in.readValue(String.class.getClassLoader());
        body = (String) in.readValue(String.class.getClassLoader());
        fuel = (String) in.readValue(String.class.getClassLoader());
        tuner = (String) in.readValue(String.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(modelName);
        dest.writeValue(niceName);
        dest.writeValue(body);
        dest.writeValue(fuel);
        dest.writeValue(tuner);
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getNiceName() {
        return niceName;
    }

    public void setNiceName(String niceName) {
        this.niceName = niceName;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getTuner() {
        return tuner;
    }

    public void setTuner(String tuner) {
        this.tuner = tuner;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append(" modelName: " + modelName);
        sb.append(", niceName: " + niceName);
        sb.append(", body: " + body);
        sb.append(", fuel: " + fuel);
        sb.append(", tuner: " + tuner);
        sb.append("]");
        return sb.toString();
    }

}
