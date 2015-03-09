package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import pl.chiqvito.edmunds.sdk.dto.enums.EquipmentTypeEnum;
import pl.chiqvito.edmunds.sdk.dto.enums.OptionCategoryEnum;

public class OptionDTO {

    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("equipmentType")
    private EquipmentTypeEnum equipmentType;

    @SerializedName("availability")
    private String availability;

    @SerializedName("attributes")
    private List<AttributeDTO> attributes;

    @SerializedName("manufactureOptionName")
    private String manufactureOptionName;

    @SerializedName("manufactureOptionCode")
    private String manufactureOptionCode;

    @SerializedName("category")
    private OptionCategoryEnum category;

    @SerializedName("price")
    private PriceDTO price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EquipmentTypeEnum getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(EquipmentTypeEnum equipmentType) {
        this.equipmentType = equipmentType;
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

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append(" id: " + id);
        sb.append(", name: " + name);
        sb.append(", description: " + description);
        sb.append(", equipmentType: " + equipmentType);
        sb.append(", availability: " + availability);
        sb.append(", attributes: " + attributes);
        sb.append(", manufactureOptionName: " + manufactureOptionName);
        sb.append(", manufactureOptionCode: " + manufactureOptionCode);
        sb.append(", category: " + category);
        sb.append(", price: " + price);
        sb.append("]");
        return sb.toString();
    }

}
