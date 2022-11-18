package com.icolak.Service.impl;

import com.github.javafaker.Faker;
import com.icolak.Service.RecipeService;
import com.icolak.Service.ShareService;
import com.icolak.enums.QuantityType;
import com.icolak.enums.RecipeType;
import com.icolak.model.Ingredient;
import com.icolak.model.Recipe;
import com.icolak.repository.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;
    private final ShareService shareService;
    private final Faker faker;

    public RecipeServiceImpl(RecipeRepository recipeRepository, ShareService shareService, Faker faker) {
        this.recipeRepository = recipeRepository;
        this.shareService = shareService;
        this.faker = faker;
    }


    @Override
    public boolean prepareRecipe() {

        Arrays.stream(RecipeType.values()).forEach(recipeType -> {
            Recipe recipe = new Recipe();
            recipe.setId(UUID.randomUUID());
            recipe.setName(faker.food().dish());
            recipe.setDuration(generateRandomValue());
            recipe.setPreparation(faker.lorem().paragraph(faker.number().numberBetween(2,3)));
            recipe.setIngredients(prepareIngredient());
            recipe.setRecipeType(recipeType);
            recipeRepository.save(recipe);
            shareService.share(recipe);
        });
        return true;
    }

    private List<Ingredient> prepareIngredient() {
        List<QuantityType> quantityTypeList = List.of(QuantityType.values());
        List<Ingredient> ingredientList = new ArrayList<>();
        for (int i = 0; i < faker.number().numberBetween(5,7); i++) {
            Ingredient ingredient = new Ingredient();
            ingredient.setName(faker.food().ingredient());
            ingredient.setQuantity(generateRandomValue());
            ingredient.setQuantityType(quantityTypeList.get(new Random().nextInt(3)));
            ingredientList.add(ingredient);
        }
        return ingredientList;
    }

    private int generateRandomValue() {
        return new Random().nextInt(10);
    }
}
