package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class PriceDTO implements Parcelable {

    public static final Parcelable.Creator<PriceDTO> CREATOR = new Parcelable.Creator<PriceDTO>() {
        public PriceDTO createFromParcel(Parcel in) {
            return new PriceDTO(in);
        }

        public PriceDTO[] newArray(int size) {
            return new PriceDTO[size];
        }
    };

    @SerializedName("baseMSRP")
    private BigDecimal baseMSRP;

    @SerializedName("baseInvoice")
    private BigDecimal baseInvoice;

    @SerializedName("deliveryCharges")
    private BigDecimal deliveryCharges;

    @SerializedName("usedTmvRetail")
    private BigDecimal usedTmvRetail;

    @SerializedName("usedPrivateParty")
    private BigDecimal usedPrivateParty;

    @SerializedName("usedTradeIn")
    private BigDecimal usedTradeIn;

    @SerializedName("estimateTmv")
    private Boolean estimateTmv;

    @SerializedName("tmvRecommendedRating")
    private BigDecimal tmvRecommendedRating;

    public PriceDTO() {
    }

    private PriceDTO(Parcel in) {
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        baseMSRP = (BigDecimal) in.readValue(BigDecimal.class.getClassLoader());
        baseInvoice = (BigDecimal) in.readValue(BigDecimal.class.getClassLoader());
        deliveryCharges = (BigDecimal) in.readValue(BigDecimal.class.getClassLoader());
        usedTmvRetail = (BigDecimal) in.readValue(BigDecimal.class.getClassLoader());
        usedPrivateParty = (BigDecimal) in.readValue(BigDecimal.class.getClassLoader());
        usedTradeIn = (BigDecimal) in.readValue(BigDecimal.class.getClassLoader());
        estimateTmv = (Boolean) in.readValue(Boolean.class.getClassLoader());
        tmvRecommendedRating = (BigDecimal) in.readValue(BigDecimal.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(baseMSRP);
        dest.writeValue(baseInvoice);
        dest.writeValue(deliveryCharges);
        dest.writeValue(usedTmvRetail);
        dest.writeValue(usedPrivateParty);
        dest.writeValue(usedTradeIn);
        dest.writeValue(estimateTmv);
        dest.writeValue(tmvRecommendedRating);
    }

    public BigDecimal getBaseMSRP() {
        return baseMSRP;
    }

    public void setBaseMSRP(BigDecimal baseMSRP) {
        this.baseMSRP = baseMSRP;
    }

    public BigDecimal getBaseInvoice() {
        return baseInvoice;
    }

    public void setBaseInvoice(BigDecimal baseInvoice) {
        this.baseInvoice = baseInvoice;
    }

    public BigDecimal getDeliveryCharges() {
        return deliveryCharges;
    }

    public void setDeliveryCharges(BigDecimal deliveryCharges) {
        this.deliveryCharges = deliveryCharges;
    }

    public BigDecimal getUsedTmvRetail() {
        return usedTmvRetail;
    }

    public void setUsedTmvRetail(BigDecimal usedTmvRetail) {
        this.usedTmvRetail = usedTmvRetail;
    }

    public BigDecimal getUsedPrivateParty() {
        return usedPrivateParty;
    }

    public void setUsedPrivateParty(BigDecimal usedPrivateParty) {
        this.usedPrivateParty = usedPrivateParty;
    }

    public BigDecimal getUsedTradeIn() {
        return usedTradeIn;
    }

    public void setUsedTradeIn(BigDecimal usedTradeIn) {
        this.usedTradeIn = usedTradeIn;
    }

    public Boolean getEstimateTmv() {
        return estimateTmv;
    }

    public void setEstimateTmv(Boolean estimateTmv) {
        this.estimateTmv = estimateTmv;
    }

    public BigDecimal getTmvRecommendedRating() {
        return tmvRecommendedRating;
    }

    public void setTmvRecommendedRating(BigDecimal tmvRecommendedRating) {
        this.tmvRecommendedRating = tmvRecommendedRating;
    }

}
