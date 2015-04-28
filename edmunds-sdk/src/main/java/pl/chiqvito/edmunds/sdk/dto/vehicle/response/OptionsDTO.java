package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import pl.chiqvito.edmunds.sdk.dto.enums.OptionCategoryEnum;

public class OptionsDTO implements Parcelable {

    public static final Parcelable.Creator<OptionsDTO> CREATOR = new Parcelable.Creator<OptionsDTO>() {
        public OptionsDTO createFromParcel(Parcel in) {
            return new OptionsDTO(in);
        }

        public OptionsDTO[] newArray(int size) {
            return new OptionsDTO[size];
        }
    };

    @SerializedName("optionsCount")
    private Integer optionsCount;

    @SerializedName("category")
    private OptionCategoryEnum category;

    @SerializedName("options")
    private List<OptionDTO> options;

    public OptionsDTO() {
    }

    protected OptionsDTO(Parcel in) {
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        optionsCount = (Integer) in.readValue(Integer.class.getClassLoader());
        category = in.readParcelable(OptionCategoryEnum.class.getClassLoader());
        options = new ArrayList<OptionDTO>();
        in.readList(options, OptionDTO.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(optionsCount);
        dest.writeParcelable(category, flags);
        dest.writeList(options);
    }

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

    public Integer getOptionsCount() {
        return optionsCount;
    }

    public void setOptionsCount(Integer optionsCount) {
        this.optionsCount = optionsCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append(" optionsCount: " + optionsCount);
        sb.append(", category: " + category);
        sb.append(", options: " + options);
        sb.append("]");
        return sb.toString();
    }

}
