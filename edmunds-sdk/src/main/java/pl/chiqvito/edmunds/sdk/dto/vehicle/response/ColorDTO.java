package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

public class ColorDTO {

    @SerializedName("r")
    private Integer r;

    @SerializedName("g")
    private Integer g;

    @SerializedName("b")
    private Integer b;

    @SerializedName("hex")
    private String hex;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append(" r: " + r);
        sb.append(", g: " + g);
        sb.append(", b: " + b);
        sb.append(", hex: " + hex);
        sb.append("]");
        return sb.toString();
    }

}
