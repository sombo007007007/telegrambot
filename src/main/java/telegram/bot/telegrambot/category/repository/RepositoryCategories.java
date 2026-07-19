package telegram.bot.telegrambot.category.repository;

import java.util.List;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
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
    // Edit Category // getRepositoryProvider
    @SelectProvider(type = RepositoryCategoriesProvider.class, method = "BuildEditsCategory")
    Categories CategoryByID(@Param("id") Long id);

    //Update Category // get RepositoryProvder
    @UpdateProvider(type = RepositoryCategoriesProvider.class, method = "BuildUpdateCategories")
    void UpdateCategory(@Param("cat") Categories categories);
    // Delete Category // Call function RepositoryProvider 
    @DeleteProvider(type = RepositoryCategoriesProvider.class, method = "BuildDeleteCategory")
    void DeleteCategory(@Param("id") Long id);
}
