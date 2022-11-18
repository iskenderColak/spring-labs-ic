package com.icolak;

import com.icolak.Service.RecipeService;
import com.icolak.config.AuthorConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class YummyRecipeApp {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(YummyRecipeApp.class, args);
        RecipeService recipeService = context.getBean(RecipeService.class);
        recipeService.prepareRecipe();

        AuthorConfig author = context.getBean(AuthorConfig.class);

        System.out.println("\nHere you are! Author information of the recipe");
        System.out.println("Name " + author.getName() + " Surname " + author.getSurname()
                + "\n" + "Phone Number "  + author.getPhone() + "\n" + "Social Media Links "
                + author.getSocialMedias() + "\n" + "Email " + author.getEmail());
    }

}
