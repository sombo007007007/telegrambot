package telegram.bot.telegrambot.category.repository.repositoryProvider;

import org.apache.ibatis.jdbc.SQL;

public class RepositoryCategoriesProvider {
    public String BuildInsrtCategories(){
        return new SQL(){{
            INSERT_INTO("categories");
            VALUES("name", "#{cate.name}");
        }}.toString();
    }

    public String BuildSelectCategories(){
        return new SQL(){{
            SELECT("*");
            FROM("categories");
        }}.toString();
    }
}
