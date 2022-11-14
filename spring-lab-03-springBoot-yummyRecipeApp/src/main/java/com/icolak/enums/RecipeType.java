package com.icolak.enums;

public enum RecipeType {
    BREAKFAST("Breakfast"),
    LUNCH("Lunch"),
    DESERT("Desert"),
    APPETIZER("Appetizer"),
    BAKED("Baked"),
    SOUP("Soup"),
    VEGETARIAN("Vegetarian");

    private String value;

    RecipeType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
