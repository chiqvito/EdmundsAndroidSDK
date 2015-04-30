package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import pl.chiqvito.edmunds.sdk.dto.enums.StateEnum;

public class YearDTO implements Parcelable {

    public static final Parcelable.Creator<YearDTO> CREATOR = new Parcelable.Creator<YearDTO>() {
        public YearDTO createFromParcel(Parcel in) {
            return new YearDTO(in);
        }

        public YearDTO[] newArray(int size) {
            return new YearDTO[size];
        }
    };

    @SerializedName("id")
    private Integer id;

    @SerializedName("make")
    private MakeDTO make;

    @SerializedName("model")
    private ModelDTO model;

    @SerializedName("states")
    private List<StateEnum> states;

    @SerializedName("styles")
    private List<StyleDTO> styles;

    @SerializedName("year")
    private Integer year;

    public YearDTO() {
    }

    private YearDTO(Parcel in) {
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        id = (Integer) in.readValue(Integer.class.getClassLoader());
        make = in.readParcelable(MakeDTO.class.getClassLoader());
        model = in.readParcelable(ModelDTO.class.getClassLoader());
        states = new ArrayList<StateEnum>();
        in.readList(states, StateEnum.class.getClassLoader());
        styles = new ArrayList<StyleDTO>();
        in.readList(styles, StyleDTO.class.getClassLoader());
        year = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeParcelable(make, flags);
        dest.writeParcelable(model, flags);
        dest.writeList(states);
        dest.writeList(styles);
        dest.writeValue(year);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<StateEnum> getStates() {
        return states;
    }

    public void setStates(List<StateEnum> states) {
        this.states = states;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public List<StyleDTO> getStyles() {
        return styles;
    }

    public void setStyles(List<StyleDTO> styles) {
        this.styles = styles;
    }

    public MakeDTO getMake() {
        return make;
    }

    public void setMake(MakeDTO make) {
        this.make = make;
    }

    public ModelDTO getModel() {
        return model;
    }

    public void setModel(ModelDTO model) {
        this.model = model;
    }

}
