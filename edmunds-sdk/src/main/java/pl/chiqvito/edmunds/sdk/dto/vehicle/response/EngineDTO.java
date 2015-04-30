package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class EngineDTO extends EquipmentDTO {

    public static final Parcelable.Creator<EngineDTO> CREATOR = new Parcelable.Creator<EngineDTO>() {
        public EngineDTO createFromParcel(Parcel in) {
            return new EngineDTO(in);
        }

        public EngineDTO[] newArray(int size) {
            return new EngineDTO[size];
        }
    };

    @SerializedName("compressionRatio")
    private Float compressionRatio;

    @SerializedName("cylinder")
    private Integer cylinder;

    @SerializedName("size")
    private Float size;

    @SerializedName("displacement")
    private Integer displacement;

    @SerializedName("configuration")
    private String configuration;

    @SerializedName("fuelType")
    private String fuelType;

    @SerializedName("horsepower")
    private Integer horsepower;

    @SerializedName("torque")
    private Integer torque;

    @SerializedName("totalValves")
    private Integer totalValves;

    @SerializedName("manufacturerEngineCode")
    private String manufacturerEngineCode;

    @SerializedName("type")
    private String type;

    @SerializedName("code")
    private String code;

    @SerializedName("compressorType")
    private String compressorType;

    @SerializedName("options")
    private List<OptionDTO> options;

    public EngineDTO() {
        super();
    }

    private EngineDTO(Parcel in) {
        super(in);
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        compressionRatio = (Float) in.readValue(Float.class.getClassLoader());
        cylinder = (Integer) in.readValue(Integer.class.getClassLoader());
        size = (Float) in.readValue(Float.class.getClassLoader());
        displacement = (Integer) in.readValue(Integer.class.getClassLoader());
        configuration = (String) in.readValue(String.class.getClassLoader());
        fuelType = (String) in.readValue(String.class.getClassLoader());
        horsepower = (Integer) in.readValue(Integer.class.getClassLoader());
        torque = (Integer) in.readValue(Integer.class.getClassLoader());
        totalValves = (Integer) in.readValue(Integer.class.getClassLoader());
        manufacturerEngineCode = (String) in.readValue(String.class.getClassLoader());
        type = (String) in.readValue(String.class.getClassLoader());
        code = (String) in.readValue(String.class.getClassLoader());
        compressorType = (String) in.readValue(String.class.getClassLoader());
        options = new ArrayList<OptionDTO>();
        in.readList(options, OptionDTO.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(compressionRatio);
        dest.writeValue(cylinder);
        dest.writeValue(size);
        dest.writeValue(displacement);
        dest.writeValue(configuration);
        dest.writeValue(fuelType);
        dest.writeValue(horsepower);
        dest.writeValue(torque);
        dest.writeValue(totalValves);
        dest.writeValue(manufacturerEngineCode);
        dest.writeValue(type);
        dest.writeValue(code);
        dest.writeValue(compressorType);
        dest.writeList(options);
    }

    public Float getCompressionRatio() {
        return compressionRatio;
    }

    public void setCompressionRatio(Float compressionRatio) {
        this.compressionRatio = compressionRatio;
    }

    public Integer getCylinder() {
        return cylinder;
    }

    public void setCylinder(Integer cylinder) {
        this.cylinder = cylinder;
    }

    public Float getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    public Integer getDisplacement() {
        return displacement;
    }

    public void setDisplacement(Integer displacement) {
        this.displacement = displacement;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Integer getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(Integer horsepower) {
        this.horsepower = horsepower;
    }

    public Integer getTorque() {
        return torque;
    }

    public void setTorque(Integer torque) {
        this.torque = torque;
    }

    public Integer getTotalValves() {
        return totalValves;
    }

    public void setTotalValves(Integer totalValves) {
        this.totalValves = totalValves;
    }

    public String getManufacturerEngineCode() {
        return manufacturerEngineCode;
    }

    public void setManufacturerEngineCode(String manufacturerEngineCode) {
        this.manufacturerEngineCode = manufacturerEngineCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCompressorType() {
        return compressorType;
    }

    public void setCompressorType(String compressorType) {
        this.compressorType = compressorType;
    }

    public List<OptionDTO> getOptions() {
        return options;
    }

    public void setOptions(List<OptionDTO> options) {
        this.options = options;
    }

}
