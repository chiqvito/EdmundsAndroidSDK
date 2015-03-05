package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

import pl.chiqvito.edmunds.sdk.dto.enums.EquipmentTypeEnum;
import pl.chiqvito.edmunds.sdk.dto.enums.OptionCategoryEnum;

public class OptionDTO {

    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    @SerializedName("equipmentType")
    private EquipmentTypeEnum equipmentType;

    @SerializedName("manufactureOptionName")
    private String manufactureOptionName;

    @SerializedName("manufactureOptionCode")
    private String manufactureOptionCode;

    @SerializedName("category")
    private OptionCategoryEnum category;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append(" id: " + id);
        sb.append(", name: " + name);
        sb.append(", equipmentType: " + equipmentType);
        sb.append(", manufactureOptionName: " + manufactureOptionName);
        sb.append(", manufactureOptionCode: " + manufactureOptionCode);
        sb.append(", category: " + category);
        sb.append("]");
        return sb.toString();
    }

}
