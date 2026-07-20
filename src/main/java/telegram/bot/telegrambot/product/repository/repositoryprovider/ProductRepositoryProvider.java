package telegram.bot.telegrambot.product.repository.repositoryprovider;

import org.apache.ibatis.jdbc.SQL;

public class ProductRepositoryProvider {
    public String BuildIndesProducts(){
        return new SQL(){{
            SELECT("c.id AS categoryId");
            SELECT("c.name AS categoryName");
            SELECT("p.id AS ProductID");
            SELECT("p.file");
            SELECT("p.title AS ProductTitle");
            SELECT("p.video AS ProductVideo");
            FROM("products p");
            JOIN("categories c ON c.id = p.cate_id");
        }}.toString();
    }
}
