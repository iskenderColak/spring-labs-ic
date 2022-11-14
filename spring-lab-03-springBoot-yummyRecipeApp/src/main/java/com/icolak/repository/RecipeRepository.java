package com.icolak.repository;

import com.icolak.model.Recipe;

public interface RecipeRepository {
    boolean save(Recipe recipe);
}
