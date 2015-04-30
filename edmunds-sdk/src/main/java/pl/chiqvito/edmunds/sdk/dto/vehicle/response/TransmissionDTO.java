package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class TransmissionDTO extends EquipmentDTO {

    public static final Parcelable.Creator<TransmissionDTO> CREATOR = new Parcelable.Creator<TransmissionDTO>() {
        public TransmissionDTO createFromParcel(Parcel in) {
            return new TransmissionDTO(in);
        }

        public TransmissionDTO[] newArray(int size) {
            return new TransmissionDTO[size];
        }
    };

    @SerializedName("automaticType")
    private String automaticType;

    @SerializedName("transmissionType")
    private String transmissionType;

    @SerializedName("numberOfSpeeds")
    private String numberOfSpeeds;

    @SerializedName("options")
    private List<OptionDTO> options;

    public TransmissionDTO() {
        super();
    }

    protected TransmissionDTO(Parcel in) {
        super(in);
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        automaticType = (String) in.readValue(String.class.getClassLoader());
        transmissionType = (String) in.readValue(String.class.getClassLoader());
        numberOfSpeeds = (String) in.readValue(String.class.getClassLoader());
        options = new ArrayList<OptionDTO>();
        in.readList(options, OptionDTO.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(automaticType);
        dest.writeValue(transmissionType);
        dest.writeValue(numberOfSpeeds);
        dest.writeList(options);
    }

    public String getAutomaticType() {
        return automaticType;
    }

    public void setAutomaticType(String automaticType) {
        this.automaticType = automaticType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getNumberOfSpeeds() {
        return numberOfSpeeds;
    }

    public void setNumberOfSpeeds(String numberOfSpeeds) {
        this.numberOfSpeeds = numberOfSpeeds;
    }

    public List<OptionDTO> getOptions() {
        return options;
    }

    public void setOptions(List<OptionDTO> options) {
        this.options = options;
    }

}
