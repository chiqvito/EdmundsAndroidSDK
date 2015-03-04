package pl.chiqvito.edmunds.sdk.dto.enums;

public enum StateEnum {
    NEW, USED, FUTURE;

    public String toString() {
        return name().toLowerCase();
    }
}
