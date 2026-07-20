package telegram.bot.telegrambot.product.repository;

import java.util.List;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import telegram.bot.telegrambot.product.models.ProductModels;
import telegram.bot.telegrambot.product.repository.repositoryprovider.ProductRepositoryProvider;

@Repository
@Mapper
public interface ProductRepository {
    // Index products Call ProductRepositoryProvider
    @SelectProvider(type = ProductRepositoryProvider.class, method = "BuildIndesProducts")
    List<ProductModels>select();
    // Store product Call ProductRepositoryProvider
    @InsertProvider(type = ProductRepositoryProvider.class, method = "BuildStoreProducts")
    void Create(@Param("prod") ProductModels productModels);
}
