package pl.chiqvito.edmunds.sdk.dto.media.response;

import com.google.gson.annotations.SerializedName;

public class LinkDTO {
    @SerializedName("rel")
    private String rel;

    @SerializedName("href")
    private String href;

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
