package telegram.bot.telegrambot.category.repository;

import java.util.List;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import telegram.bot.telegrambot.category.models.Categories;
import telegram.bot.telegrambot.category.repository.repositoryProvider.RepositoryCategoriesProvider;


@Repository
@Mapper
public interface RepositoryCategories {
    // Insert Data
    @InsertProvider(type = RepositoryCategoriesProvider.class, method = "BuildInsrtCategories")
    void Insert(@Param("cate") Categories categories);
    // select 
    @SelectProvider(type = RepositoryCategoriesProvider.class, method = "BuildSelectCategories")
    List<Categories>setect();
}
