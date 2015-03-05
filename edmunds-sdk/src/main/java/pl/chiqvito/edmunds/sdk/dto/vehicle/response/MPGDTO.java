package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

public class MPGDTO {

    @SerializedName("highway")
    private Integer highway;

    @SerializedName("city")
    private Integer city;

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
