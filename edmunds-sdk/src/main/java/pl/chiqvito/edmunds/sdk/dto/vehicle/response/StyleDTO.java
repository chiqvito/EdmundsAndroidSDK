package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import pl.chiqvito.edmunds.sdk.dto.enums.StateEnum;

public class StyleDTO implements Parcelable {

    public static final Parcelable.Creator<StyleDTO> CREATOR = new Parcelable.Creator<StyleDTO>() {
        public StyleDTO createFromParcel(Parcel in) {
            return new StyleDTO(in);
        }

        public StyleDTO[] newArray(int size) {
            return new StyleDTO[size];
        }
    };

    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    @SerializedName("make")
    private MakeDTO make;

    @SerializedName("model")
    private ModelDTO model;

    @SerializedName("year")
    private YearDTO year;

    @SerializedName("submodel")
    private SubModelDTO submodel;

    @SerializedName("trim")
    private String trim;

    @SerializedName("states")
    private List<StateEnum> states;

    @SerializedName("engine")
    private EngineDTO engine;

    @SerializedName("transmission")
    private TransmissionDTO transmission;

    @SerializedName("options")
    private List<OptionsDTO> options;

    @SerializedName("colors")
    private List<OptionsColorDTO> colors;

    @SerializedName("drivenWheels")
    private String drivenWheels;

    @SerializedName("numOfDoors")
    private String numOfDoors;

    @SerializedName("squishVins")
    private List<String> squishVins;

    @SerializedName("categories")
    private CategoryDTO category;

    @SerializedName("MPG")
    private MPGDTO mpg;

    @SerializedName("manufacturerCode")
    private String manufacturerCode;

    @SerializedName("price")
    private PriceDTO price;

    public StyleDTO() {
    }

    private StyleDTO(Parcel in) {
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        id = (Integer) in.readValue(Integer.class.getClassLoader());
        name = (String) in.readValue(String.class.getClassLoader());
        make = in.readParcelable(MakeDTO.class.getClassLoader());
        model = in.readParcelable(ModelDTO.class.getClassLoader());
        year = in.readParcelable(YearDTO.class.getClassLoader());
        submodel = in.readParcelable(SubModelDTO.class.getClassLoader());
        trim = (String) in.readValue(String.class.getClassLoader());
        states = new ArrayList<StateEnum>();
        in.readList(states, StateEnum.class.getClassLoader());
        engine = in.readParcelable(EngineDTO.class.getClassLoader());
        transmission = in.readParcelable(TransmissionDTO.class.getClassLoader());
        options = new ArrayList<OptionsDTO>();
        in.readList(options, OptionsDTO.class.getClassLoader());
        colors = new ArrayList<OptionsColorDTO>();
        in.readList(colors, OptionsColorDTO.class.getClassLoader());
        drivenWheels = (String) in.readValue(String.class.getClassLoader());
        numOfDoors = (String) in.readValue(String.class.getClassLoader());
        squishVins = new ArrayList<String>();
        in.readStringList(squishVins);
        category = in.readParcelable(CategoryDTO.class.getClassLoader());
        mpg = in.readParcelable(MPGDTO.class.getClassLoader());
        manufacturerCode = (String) in.readValue(String.class.getClassLoader());
        price = in.readParcelable(PriceDTO.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(name);
        dest.writeParcelable(make, flags);
        dest.writeParcelable(model, flags);
        dest.writeParcelable(year, flags);
        dest.writeParcelable(submodel, flags);
        dest.writeValue(trim);
        dest.writeList(states);
        dest.writeParcelable(engine, flags);
        dest.writeParcelable(transmission, flags);
        dest.writeList(options);
        dest.writeList(colors);
        dest.writeValue(drivenWheels);
        dest.writeValue(numOfDoors);
        dest.writeStringList(squishVins);
        dest.writeParcelable(category, flags);
        dest.writeParcelable(mpg, flags);
        dest.writeValue(manufacturerCode);
        dest.writeParcelable(price, flags);
    }

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

    public SubModelDTO getSubmodel() {
        return submodel;
    }

    public void setSubmodel(SubModelDTO submodel) {
        this.submodel = submodel;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public List<StateEnum> getStates() {
        return states;
    }

    public void setStates(List<StateEnum> states) {
        this.states = states;
    }

    public MakeDTO getMake() {
        return make;
    }

    public void setMake(MakeDTO make) {
        this.make = make;
    }

    public ModelDTO getModel() {
        return model;
    }

    public void setModel(ModelDTO model) {
        this.model = model;
    }

    public YearDTO getYear() {
        return year;
    }

    public void setYear(YearDTO year) {
        this.year = year;
    }

    public EngineDTO getEngine() {
        return engine;
    }

    public void setEngine(EngineDTO engine) {
        this.engine = engine;
    }

    public TransmissionDTO getTransmission() {
        return transmission;
    }

    public void setTransmission(TransmissionDTO transmission) {
        this.transmission = transmission;
    }

    public List<OptionsDTO> getOptions() {
        return options;
    }

    public void setOptions(List<OptionsDTO> options) {
        this.options = options;
    }

    public List<OptionsColorDTO> getColors() {
        return colors;
    }

    public void setColors(List<OptionsColorDTO> colors) {
        this.colors = colors;
    }

    public String getDrivenWheels() {
        return drivenWheels;
    }

    public void setDrivenWheels(String drivenWheels) {
        this.drivenWheels = drivenWheels;
    }

    public String getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(String numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public List<String> getSquishVins() {
        return squishVins;
    }

    public void setSquishVins(List<String> squishVins) {
        this.squishVins = squishVins;
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }

    public MPGDTO getMpg() {
        return mpg;
    }

    public void setMpg(MPGDTO mpg) {
        this.mpg = mpg;
    }

    public String getManufacturerCode() {
        return manufacturerCode;
    }

    public void setManufacturerCode(String manufacturerCode) {
        this.manufacturerCode = manufacturerCode;
    }

    public PriceDTO getPrice() {
        return price;
    }

    public void setPrice(PriceDTO price) {
        this.price = price;
    }

}
