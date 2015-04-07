package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import pl.chiqvito.edmunds.sdk.dto.enums.OptionCategoryEnum;

public class OptionDTO extends EquipmentDTO {

    public static final Parcelable.Creator<OptionDTO> CREATOR = new Parcelable.Creator<OptionDTO>() {
        public OptionDTO createFromParcel(Parcel in) {
            return new OptionDTO(in);
        }

        public OptionDTO[] newArray(int size) {
            return new OptionDTO[size];
        }
    };

    @SerializedName("description")
    private String description;

    @SerializedName("attributes")
    private List<AttributeDTO> attributes;

    @SerializedName("manufactureOptionName")
    private String manufactureOptionName;

    @SerializedName("manufactureOptionCode")
    private String manufactureOptionCode;

    @SerializedName("category")
    private OptionCategoryEnum category;

    private List<EquipmentDTO> equipment;

    @SerializedName("price")
    private PriceDTO price;

    public OptionDTO() {
        super();
    }

    private OptionDTO(Parcel in) {
        super(in);
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        //TODO
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        //TODO
    }

    public String getManufactureOptionName() {
        return manufactureOptionName;
    }

    public void setManufactureOptionName(String manufactureOptionName) {
        this.manufactureOptionName = manufactureOptionName;
    }

    public String getManufactureOptionCode() {
        return manufactureOptionCode;
    }

    public void setManufactureOptionCode(String manufactureOptionCode) {
        this.manufactureOptionCode = manufactureOptionCode;
    }

    public OptionCategoryEnum getCategory() {
        return category;
    }

    public void setCategory(OptionCategoryEnum category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<AttributeDTO> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeDTO> attributes) {
        this.attributes = attributes;
    }

    public PriceDTO getPrice() {
        return price;
    }

    public void setPrice(PriceDTO price) {
        this.price = price;
    }

    public List<EquipmentDTO> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<EquipmentDTO> equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append("<" + super.toString() + ">");
        sb.append(", description: " + description);
        sb.append(", attributes: " + attributes);
        sb.append(", manufactureOptionName: " + manufactureOptionName);
        sb.append(", manufactureOptionCode: " + manufactureOptionCode);
        sb.append(", category: " + category);
        sb.append(", price: " + price);
        sb.append(", equipment: " + equipment);
        sb.append("]");
        return sb.toString();
    }

}
