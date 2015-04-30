package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ModelsDTO implements Parcelable {

    public static final Parcelable.Creator<ModelsDTO> CREATOR = new Parcelable.Creator<ModelsDTO>() {
        public ModelsDTO createFromParcel(Parcel in) {
            return new ModelsDTO(in);
        }

        public ModelsDTO[] newArray(int size) {
            return new ModelsDTO[size];
        }
    };

    @SerializedName("models")
    private List<ModelDTO> models;

    @SerializedName("modelsCount")
    private Integer modelsCount;

    public ModelsDTO() {
    }

    private ModelsDTO(Parcel in) {
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        modelsCount = (Integer) in.readValue(Integer.class.getClassLoader());
        models = new ArrayList<ModelDTO>();
        in.readList(models, ModelDTO.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(modelsCount);
        dest.writeList(models);
    }

    public List<ModelDTO> getModels() {
        return models;
    }

    public void setModels(List<ModelDTO> models) {
        this.models = models;
    }

    public Integer getModelsCount() {
        return modelsCount;
    }

    public void setModelsCount(Integer modelsCount) {
        this.modelsCount = modelsCount;
    }

}
