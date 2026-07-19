package telegram.bot.telegrambot.category.services;

import java.util.List;

import telegram.bot.telegrambot.category.models.Categories;

public interface ServiecCategories {
    // Store categories
    void addNewCategory(Categories categories);
    // Index Category
    List<Categories>findAll();
    // Edits Category
    Categories CategoryByID(Long id);
    // Update Category
    void UpdateCategory(Categories categories);
    // Delete Category
    void DeleteCategory(Long id);
    
}
