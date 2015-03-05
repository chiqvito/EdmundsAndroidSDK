package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

public class ColorChipDTO {

    @SerializedName("primary")
    private ColorDTO primary;

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
