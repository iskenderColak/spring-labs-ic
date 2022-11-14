package com.icolak.enums;

public enum QuantityType {
    OUNCE("ounce"),
    LB("lb"),
    TBSP("tbsp");

    private String value;
    QuantityType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
