package com.icolak.Service.impl;

import com.icolak.Service.ShareService;
import com.icolak.model.Recipe;
import org.springframework.stereotype.Component;

@Component
public class FacebookShareServiceImpl implements ShareService {
    @Override
    public boolean share(Recipe recipe) {
        System.out.println("\n*******Facebook Recipe Sharing Service*******");
        System.out.println("Recipe Type : \t" + recipe.getRecipeType());
        System.out.println("Recipe\t\t: \t" + recipe.getName());
        System.out.println("-----------Ingredients-----------");
        recipe.getIngredients().stream().forEach(ingredient -> {
            System.out.println("    Ingrediant name: " + ingredient.getName() +
                                " Quantity: " + ingredient.getQuantity() +
                                " " + ingredient.getQuantityType());
        });

        System.out.println("Preparation : \t" + recipe.getPreparation());

        return true;
    }
}
