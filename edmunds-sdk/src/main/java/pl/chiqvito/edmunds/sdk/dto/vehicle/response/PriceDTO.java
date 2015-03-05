package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class PriceDTO {

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append(" baseMSRP: " + baseMSRP);
        sb.append(", baseInvoice: " + baseInvoice);
        sb.append(", deliveryCharges: " + deliveryCharges);
        sb.append(", usedTmvRetail: " + usedTmvRetail);
        sb.append(", usedPrivateParty: " + usedPrivateParty);
        sb.append(", usedTradeIn: " + usedTradeIn);
        sb.append(", estimateTmv: " + estimateTmv);
        sb.append(", tmvRecommendedRating: " + tmvRecommendedRating);
        sb.append("]");
        return sb.toString();
    }

}
