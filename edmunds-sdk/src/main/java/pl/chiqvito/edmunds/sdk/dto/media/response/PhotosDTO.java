package pl.chiqvito.edmunds.sdk.dto.media.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PhotosDTO {

    @SerializedName("photos")
    private List<PhotoDTO> photos;

    @SerializedName("photosCount")
    private Integer photosCount;

    @SerializedName("links")
    private List<LinkDTO> links;

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
