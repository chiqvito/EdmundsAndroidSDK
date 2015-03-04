package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

public class SubModelDTO {

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
