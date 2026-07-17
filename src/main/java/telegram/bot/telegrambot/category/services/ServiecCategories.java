package telegram.bot.telegrambot.category.services;

import java.util.List;

import telegram.bot.telegrambot.category.models.Categories;

public interface ServiecCategories {

    void addNewCategory(Categories categories);
    List<Categories>findAll();

}
