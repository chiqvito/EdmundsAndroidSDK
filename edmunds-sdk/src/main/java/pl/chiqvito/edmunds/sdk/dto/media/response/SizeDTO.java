package pl.chiqvito.edmunds.sdk.dto.media.response;

import com.google.gson.annotations.SerializedName;

public class SizeDTO {
    @SerializedName("width")
    private Integer width;

    @SerializedName("height")
    private Integer height;

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
