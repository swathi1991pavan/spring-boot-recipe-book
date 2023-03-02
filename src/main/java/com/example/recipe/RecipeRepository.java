// Write your code herea

package com.example.recipe;
import java.util.*;


public interface RecipeRepository{
    ArrayList<Recipe> getRecipes();

    Recipe addRecipe(Recipe recipe);

    Recipe getRecipeById(int reciped);

    Recipe updateRecipe(Recipe recipe, int recipeId);

    void deleteRecipe(int recipeId);
}