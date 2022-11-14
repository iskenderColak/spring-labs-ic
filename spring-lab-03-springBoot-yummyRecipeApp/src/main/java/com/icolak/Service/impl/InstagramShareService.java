package com.icolak.Service.impl;

import com.icolak.Service.ShareService;
import com.icolak.model.Recipe;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class InstagramShareService implements ShareService {
    @Override
    public boolean share(Recipe recipe) {

        System.out.println("Shared on Instagram");
        System.out.println("RecipeType: " + recipe.getRecipeType());
        System.out.println("Recipe Name " + recipe.getName() );
        System.out.println("Ingredient List ");
        recipe.getIngredients().forEach(ingredients -> {
            System.out.println("    Ingredient Name " + ingredients.getName() + " Quantity : " + ingredients.getQuantity() +
                    " " + ingredients.getQuantityType());
        });
        System.out.println("Preperation: \n" + "\t" + recipe.getPreparation());

        return true;
    }
}
