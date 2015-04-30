package pl.chiqvito.edmunds.sdk.dto.media.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class PhotoDTO implements Parcelable {

    public static final Parcelable.Creator<PhotoDTO> CREATOR = new Parcelable.Creator<PhotoDTO>() {
        public PhotoDTO createFromParcel(Parcel in) {
            return new PhotoDTO(in);
        }

        public PhotoDTO[] newArray(int size) {
            return new PhotoDTO[size];
        }
    };

    @SerializedName("title")
    private String title;

    @SerializedName("tags")
    private List<String> tags;

    @SerializedName("sources")
    private List<PhotoSourceDTO> sources;

    public PhotoDTO() {
    }

    private PhotoDTO(Parcel in) {
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        title = (String) in.readValue(String.class.getClassLoader());
        tags = new ArrayList<String>();
        in.readStringList(tags);
        sources = new ArrayList<PhotoSourceDTO>();
        in.readList(sources, PhotoSourceDTO.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(title);
        dest.writeStringList(tags);
        dest.writeList(sources);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<PhotoSourceDTO> getSources() {
        return sources;
    }

    public void setSources(List<PhotoSourceDTO> sources) {
        this.sources = sources;
    }
}
