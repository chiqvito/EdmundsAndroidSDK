package pl.chiqvito.edmunds.sdk.dto.vehicle.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import pl.chiqvito.edmunds.sdk.dto.enums.StateEnum;

public class StyleDTO {

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.getClass().getSimpleName());
        sb.append(" id: " + id);
        sb.append(", name: " + name);
        sb.append(", trim: " + trim);
        sb.append(", states: " + states);
        sb.append(", submodel: " + submodel);
        sb.append(", make: " + make);
        sb.append(", model: " + model);
        sb.append(", year: " + year);
        sb.append(", engine: " + engine);
        sb.append(", transmission: " + transmission);
        sb.append(", options: " + options);
        sb.append(", colors: " + colors);
        sb.append(", drivenWheels: " + drivenWheels);
        sb.append(", numOfDoors: " + numOfDoors);
        sb.append(", squishVins: " + squishVins);
        sb.append(", category: " + category);
        sb.append(", mpg: " + mpg);
        sb.append(", manufacturerCode: " + manufacturerCode);
        sb.append(", price: " + price);
        sb.append("]");
        return sb.toString();
    }

}
