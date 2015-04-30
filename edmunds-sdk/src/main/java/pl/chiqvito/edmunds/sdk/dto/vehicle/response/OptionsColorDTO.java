package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import pl.chiqvito.edmunds.sdk.dto.enums.OptionCategoryEnum;

public class OptionsColorDTO implements Parcelable {

    public static final Parcelable.Creator<OptionsColorDTO> CREATOR = new Parcelable.Creator<OptionsColorDTO>() {
        public OptionsColorDTO createFromParcel(Parcel in) {
            return new OptionsColorDTO(in);
        }

        public OptionsColorDTO[] newArray(int size) {
            return new OptionsColorDTO[size];
        }
    };

    @SerializedName("category")
    private OptionCategoryEnum category;

    @SerializedName("options")
    private List<OptionColorDTO> options;

    public OptionsColorDTO() {
    }

    protected OptionsColorDTO(Parcel in) {
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        category = in.readParcelable(OptionCategoryEnum.class.getClassLoader());
        options = new ArrayList<OptionColorDTO>();
        in.readList(options, OptionColorDTO.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(category, flags);
        dest.writeList(options);
    }

    public OptionCategoryEnum getCategory() {
        return category;
    }

    public void setCategory(OptionCategoryEnum category) {
        this.category = category;
    }

    public List<OptionColorDTO> getOptions() {
        return options;
    }

    public void setOptions(List<OptionColorDTO> options) {
        this.options = options;
    }

}
