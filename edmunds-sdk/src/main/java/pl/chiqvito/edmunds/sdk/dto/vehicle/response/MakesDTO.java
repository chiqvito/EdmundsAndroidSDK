package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MakesDTO {

    @SerializedName("makes")
    private List<MakeDTO> makes;

    @SerializedName("makesCount")
    private Integer makesCount;

    public List<MakeDTO> getMakes() {
        return makes;
    }

    public void setMakes(List<MakeDTO> makes) {
        this.makes = makes;
    }

    public Integer getMakesCount() {
        return makesCount;
    }

    public void setMakesCount(Integer makesCount) {
        this.makesCount = makesCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append(" makesCount: " + makesCount);
        sb.append(", makes: " + makes);
        sb.append("]");
        return sb.toString();
    }

}
