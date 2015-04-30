package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import pl.chiqvito.edmunds.sdk.dto.enums.StateEnum;

public class ModelDTO implements Parcelable {

    public static final Parcelable.Creator<ModelDTO> CREATOR = new Parcelable.Creator<ModelDTO>() {
        public ModelDTO createFromParcel(Parcel in) {
            return new ModelDTO(in);
        }

        public ModelDTO[] newArray(int size) {
            return new ModelDTO[size];
        }
    };

    @SerializedName("id")
    private String id;

    @SerializedName("make")
    private MakeDTO make;

    @SerializedName("name")
    private String name;

    @SerializedName("niceName")
    private String niceName;

    @SerializedName("states")
    private List<StateEnum> states;

    @SerializedName("years")
    private List<YearDTO> years;

    public ModelDTO() {
    }

    private ModelDTO(Parcel in) {
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        id = (String) in.readValue(String.class.getClassLoader());
        make = in.readParcelable(MakeDTO.class.getClassLoader());
        name = (String) in.readValue(String.class.getClassLoader());
        niceName = (String) in.readValue(String.class.getClassLoader());
        states = new ArrayList<StateEnum>();
        in.readList(states, StateEnum.class.getClassLoader());
        years = new ArrayList<YearDTO>();
        in.readList(years, YearDTO.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeParcelable(make, flags);
        dest.writeValue(name);
        dest.writeValue(niceName);
        dest.writeList(states);
        dest.writeList(years);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNiceName() {
        return niceName;
    }

    public void setNiceName(String niceName) {
        this.niceName = niceName;
    }

    public List<StateEnum> getStates() {
        return states;
    }

    public void setStates(List<StateEnum> states) {
        this.states = states;
    }

    public List<YearDTO> getYears() {
        return years;
    }

    public void setYears(List<YearDTO> years) {
        this.years = years;
    }

    public MakeDTO getMake() {
        return make;
    }

    public void setMake(MakeDTO make) {
        this.make = make;
    }

}
