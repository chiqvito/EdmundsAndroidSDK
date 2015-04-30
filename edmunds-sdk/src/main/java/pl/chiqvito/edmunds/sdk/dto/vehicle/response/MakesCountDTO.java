package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MakesCountDTO {

    @SerializedName("makesCount")
    private Integer makesCount;

    @SerializedName("makes")
    private List<MakeCountDTO> makes;

    public Integer getMakesCount() {
        return makesCount;
    }

    public void setMakesCount(Integer makesCount) {
        this.makesCount = makesCount;
    }

    public List<MakeCountDTO> getMakes() {
        return makes;
    }

    public void setMakes(List<MakeCountDTO> makes) {
        this.makes = makes;
    }

}
