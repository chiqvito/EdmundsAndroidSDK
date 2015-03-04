package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import pl.chiqvito.edmunds.sdk.dto.enums.StateEnum;

public class StyleDTO {

    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    @SerializedName("submodel")
    private SubModelDTO submodel;

    @SerializedName("trim")
    private String trim;

    @SerializedName("states")
    private List<StateEnum> states;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubModelDTO getSubmodel() {
        return submodel;
    }

    public void setSubmodel(SubModelDTO submodel) {
        this.submodel = submodel;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public List<StateEnum> getStates() {
        return states;
    }

    public void setStates(List<StateEnum> states) {
        this.states = states;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append(" id: " + id);
        sb.append(", name: " + name);
        sb.append(", trim: " + trim);
        sb.append(", states: " + states);
        sb.append(", submodel: " + submodel);
        sb.append("]");
        return sb.toString();
    }
    
}
