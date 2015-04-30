package pl.chiqvito.edmunds.sdk.dto.media.response;

import com.google.gson.annotations.SerializedName;

public class PhotoSourceDTO {
    @SerializedName("link")
    private LinkDTO link;

    @SerializedName("extension")
    private String extension;

    @SerializedName("size")
    private SizeDTO size;

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
