package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class MakesDTO implements Parcelable {

    public static final Parcelable.Creator<MakesDTO> CREATOR = new Parcelable.Creator<MakesDTO>() {
        public MakesDTO createFromParcel(Parcel in) {
            return new MakesDTO(in);
        }

        public MakesDTO[] newArray(int size) {
            return new MakesDTO[size];
        }
    };

    @SerializedName("makes")
    private List<MakeDTO> makes;

    @SerializedName("makesCount")
    private Integer makesCount;

    public MakesDTO() {
    }

    private MakesDTO(Parcel in) {
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        makesCount = (Integer) in.readValue(Integer.class.getClassLoader());
        makes = new ArrayList<MakeDTO>();
        in.readList(makes, MakeDTO.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(makesCount);
        dest.writeList(makes);
    }

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

}
