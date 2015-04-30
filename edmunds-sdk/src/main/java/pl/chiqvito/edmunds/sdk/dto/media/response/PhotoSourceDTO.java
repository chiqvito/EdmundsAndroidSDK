package pl.chiqvito.edmunds.sdk.dto.media.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class PhotoSourceDTO implements Parcelable {

    public static final Parcelable.Creator<PhotoSourceDTO> CREATOR = new Parcelable.Creator<PhotoSourceDTO>() {
        public PhotoSourceDTO createFromParcel(Parcel in) {
            return new PhotoSourceDTO(in);
        }

        public PhotoSourceDTO[] newArray(int size) {
            return new PhotoSourceDTO[size];
        }
    };

    @SerializedName("link")
    private LinkDTO link;

    @SerializedName("extension")
    private String extension;

    @SerializedName("size")
    private SizeDTO size;

    public PhotoSourceDTO() {
    }

    private PhotoSourceDTO(Parcel in) {
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        link = (LinkDTO) in.readParcelable(LinkDTO.class.getClassLoader());
        extension = (String) in.readValue(String.class.getClassLoader());
        size = (SizeDTO) in.readParcelable(SizeDTO.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(link, flags);
        dest.writeValue(extension);
        dest.writeParcelable(size, flags);
    }

    public LinkDTO getLink() {
        return link;
    }

    public void setLink(LinkDTO link) {
        this.link = link;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public SizeDTO getSize() {
        return size;
    }

    public void setSize(SizeDTO size) {
        this.size = size;
    }
}
