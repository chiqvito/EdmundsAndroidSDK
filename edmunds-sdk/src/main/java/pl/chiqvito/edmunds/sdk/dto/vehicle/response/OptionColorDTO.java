package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OptionColorDTO extends OptionDTO {

    @SerializedName("colorChips")
    private ColorChipDTO colorChips;

    @SerializedName("fabricTypes")
    private List<FabricDTO> fabricTypes;

    public ColorChipDTO getColorChips() {
        return colorChips;
    }

    public void setColorChips(ColorChipDTO colorChips) {
        this.colorChips = colorChips;
    }

    public List<FabricDTO> getFabricType() {
        return fabricTypes;
    }

    public void setFabricType(List<FabricDTO> fabricType) {
        this.fabricTypes = fabricTypes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append(" colorChips: " + colorChips);
        sb.append(", fabricTypes: " + fabricTypes);
        sb.append("]");
        return sb.toString();
    }

}
