package pl.chiqvito.edmunds.sdk.dto.media.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class PhotosDTO implements Parcelable {

    public static final Parcelable.Creator<PhotosDTO> CREATOR = new Parcelable.Creator<PhotosDTO>() {
        public PhotosDTO createFromParcel(Parcel in) {
            return new PhotosDTO(in);
        }

        public PhotosDTO[] newArray(int size) {
            return new PhotosDTO[size];
        }
    };

    @SerializedName("photos")
    private List<PhotoDTO> photos;

    @SerializedName("photosCount")
    private Integer photosCount;

    @SerializedName("links")
    private List<LinkDTO> links;

    public PhotosDTO() {
    }

    private PhotosDTO(Parcel in) {
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        photosCount = (Integer) in.readValue(Integer.class.getClassLoader());
        photos = new ArrayList<PhotoDTO>();
        in.readList(photos, PhotoDTO.class.getClassLoader());
        links = new ArrayList<LinkDTO>();
        in.readList(links, LinkDTO.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(photosCount);
        dest.writeList(photos);
        dest.writeList(links);
    }

    public List<PhotoDTO> getPhotos() {
        return photos;
    }

    public void setPhotos(List<PhotoDTO> photos) {
        this.photos = photos;
    }

    public Integer getPhotosCount() {
        return photosCount;
    }

    public void setPhotosCount(Integer photosCount) {
        this.photosCount = photosCount;
    }

    public List<LinkDTO> getLinks() {
        return links;
    }

    public void setLinks(List<LinkDTO> links) {
        this.links = links;
    }
}
