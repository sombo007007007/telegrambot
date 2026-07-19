package telegram.bot.telegrambot.category.repository.repositoryProvider;

import org.apache.ibatis.jdbc.SQL;

public class RepositoryCategoriesProvider {
    // get Data with model
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
    public String BuildEditsCategory(){
        return new SQL(){{
            SELECT("*");
            FROM("categories");
            WHERE("id = #{id}");
        }}.toString();
    }

    public String BuildUpdateCategories(){
        return new SQL(){{
            UPDATE("categories");
            SET("name = #{cat.name}");
            WHERE("id = #{cat.id}");
        }}.toString();
    }
    public String BuildDeleteCategory(){
         return new SQL(){{
            DELETE_FROM("categories");
            WHERE("id = #{id}");
         }}.toString();
    }
}