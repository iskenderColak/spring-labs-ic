package com.icolak.model;

import com.icolak.enums.QuantityType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ingredient {
    private String name;
    private int quantity;
    private QuantityType quantityType;
}
