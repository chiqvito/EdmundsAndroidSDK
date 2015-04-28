package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class OptionColorDTO extends OptionDTO {

    public static final Parcelable.Creator<OptionColorDTO> CREATOR = new Parcelable.Creator<OptionColorDTO>() {
        public OptionColorDTO createFromParcel(Parcel in) {
            return new OptionColorDTO(in);
        }

        public OptionColorDTO[] newArray(int size) {
            return new OptionColorDTO[size];
        }
    };

    @SerializedName("colorChips")
    private ColorChipDTO colorChips;

    @SerializedName("fabricTypes")
    private List<FabricDTO> fabricTypes;

    public OptionColorDTO() {
        super();
    }

    protected OptionColorDTO(Parcel in) {
        super(in);
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        colorChips = in.readParcelable(ColorChipDTO.class.getClassLoader());
        fabricTypes = new ArrayList<FabricDTO>();
        in.readList(fabricTypes, FabricDTO.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(colorChips, flags);
        dest.writeList(fabricTypes);
    }

    public ColorChipDTO getColorChips() {
        return colorChips;
    }

    public void setColorChips(ColorChipDTO colorChips) {
        this.colorChips = colorChips;
    }

    public List<FabricDTO> getFabricType() {
        return fabricTypes;
    }

    public void setFabricType(List<FabricDTO> fabricType) {
        this.fabricTypes = fabricTypes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append("<" + super.toString() + ">");
        sb.append(" colorChips: " + colorChips);
        sb.append(", fabricTypes: " + fabricTypes);
        sb.append("]");
        return sb.toString();
    }

}
