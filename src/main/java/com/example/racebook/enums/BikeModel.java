package com.example.racebook.enums;

public enum BikeModel {
    KTM("KTM"),
    YAMAHA("Yamaha"),
    HONDA("HONDA");

    private final String value;

    BikeModel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
