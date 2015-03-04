package pl.chiqvito.edmunds.sdk.dto.enums;

public enum ViewTypeEnum {
    BASIC, FULL;

    public String toString() {
        return name().toLowerCase();
    }
}
