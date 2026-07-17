package telegram.bot.telegrambot.category.services.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import telegram.bot.telegrambot.category.models.Categories;
import telegram.bot.telegrambot.category.repository.RepositoryCategories;
import telegram.bot.telegrambot.category.services.ServiecCategories;

@Service
@RequiredArgsConstructor
public class ServiceCategoriesImpl implements ServiecCategories  {
    private final RepositoryCategories repositoryCategories;
    @Override
    public void addNewCategory(Categories categories) {
        repositoryCategories.Insert(categories);  
    }

    @Override
    public List<Categories> findAll() {
        return repositoryCategories.setect();
    }
}
