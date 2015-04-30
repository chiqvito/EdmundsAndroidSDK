package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
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

    protected OptionDTO(Parcel in) {
        super(in);
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        description = (String) in.readValue(String.class.getClassLoader());
        attributes = new ArrayList<AttributeDTO>();
        in.readList(attributes, AttributeDTO.class.getClassLoader());
        manufactureOptionName = (String) in.readValue(String.class.getClassLoader());
        manufactureOptionCode = (String) in.readValue(String.class.getClassLoader());
        category = in.readParcelable(OptionCategoryEnum.class.getClassLoader());
        equipment = new ArrayList<EquipmentDTO>();
        in.readList(equipment, EquipmentDTO.class.getClassLoader());
        price = in.readParcelable(PriceDTO.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(description);
        dest.writeList(attributes);
        dest.writeValue(manufactureOptionName);
        dest.writeValue(manufactureOptionCode);
        dest.writeParcelable(category, flags);
        dest.writeList(equipment);
        dest.writeParcelable(price, flags);
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

}
