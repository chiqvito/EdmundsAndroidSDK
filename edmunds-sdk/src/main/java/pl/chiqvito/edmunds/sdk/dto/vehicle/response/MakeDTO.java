package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class MakeDTO implements Parcelable {

    public static final Parcelable.Creator<MakeDTO> CREATOR = new Parcelable.Creator<MakeDTO>() {
        public MakeDTO createFromParcel(Parcel in) {
            return new MakeDTO(in);
        }

        public MakeDTO[] newArray(int size) {
            return new MakeDTO[size];
        }
    };

    @SerializedName("id")
    private Integer id;

    @SerializedName("models")
    private List<ModelDTO> models;

    @SerializedName("name")
    private String name;

    @SerializedName("niceName")
    private String niceName;

    public MakeDTO() {
    }

    private MakeDTO(Parcel in) {
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        id = (Integer) in.readValue(Integer.class.getClassLoader());
        models = new ArrayList<ModelDTO>();
        in.readList(models, ModelDTO.class.getClassLoader());
        name = (String) in.readValue(String.class.getClassLoader());
        niceName = (String) in.readValue(String.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeList(models);
        dest.writeValue(name);
        dest.writeValue(niceName);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<ModelDTO> getModels() {
        return models;
    }

    public void setModels(List<ModelDTO> models) {
        this.models = models;
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

}
