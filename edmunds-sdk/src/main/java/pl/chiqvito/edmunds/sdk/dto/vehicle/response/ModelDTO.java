package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import pl.chiqvito.edmunds.sdk.dto.enums.StateEnum;

public class ModelDTO {

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append(" id: " + id);
        sb.append(", name: " + name);
        sb.append(", niceName: " + niceName);
        sb.append(", states: " + states);
        sb.append(", years: " + years);
        sb.append(", make: " + make);
        sb.append("]");
        return sb.toString();
    }

}
