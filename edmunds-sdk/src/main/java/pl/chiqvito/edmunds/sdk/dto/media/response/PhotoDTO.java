package pl.chiqvito.edmunds.sdk.dto.media.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PhotoDTO {

    @SerializedName("title")
    private String title;

    @SerializedName("tags")
    private List<String> tags;

    @SerializedName("sources")
    private List<PhotoSourceDTO> sources;

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
