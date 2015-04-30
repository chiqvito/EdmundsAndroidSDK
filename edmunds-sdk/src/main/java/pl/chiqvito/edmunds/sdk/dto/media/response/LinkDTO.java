package pl.chiqvito.edmunds.sdk.dto.media.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class LinkDTO implements Parcelable {

    public static final Parcelable.Creator<LinkDTO> CREATOR = new Parcelable.Creator<LinkDTO>() {
        public LinkDTO createFromParcel(Parcel in) {
            return new LinkDTO(in);
        }

        public LinkDTO[] newArray(int size) {
            return new LinkDTO[size];
        }
    };

    @SerializedName("rel")
    private String rel;

    @SerializedName("href")
    private String href;

    public LinkDTO() {
    }

    private LinkDTO(Parcel in) {
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        rel = (String) in.readValue(String.class.getClassLoader());
        href = (String) in.readValue(String.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(rel);
        dest.writeValue(href);
    }

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
