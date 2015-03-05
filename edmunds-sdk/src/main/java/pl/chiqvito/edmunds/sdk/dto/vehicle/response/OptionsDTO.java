package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import pl.chiqvito.edmunds.sdk.dto.enums.OptionCategoryEnum;

public class OptionsDTO {

    @SerializedName("category")
    private OptionCategoryEnum category;

    @SerializedName("options")
    private List<OptionDTO> options;

    public OptionCategoryEnum getCategory() {
        return category;
    }

    public void setCategory(OptionCategoryEnum category) {
        this.category = category;
    }

    public List<OptionDTO> getOptions() {
        return options;
    }

    public void setOptions(List<OptionDTO> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append(" category: " + category);
        sb.append(", options: " + options);
        sb.append("]");
        return sb.toString();
    }

}
