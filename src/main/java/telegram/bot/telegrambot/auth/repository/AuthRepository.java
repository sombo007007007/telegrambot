package telegram.bot.telegrambot.auth.repository;


import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import telegram.bot.telegrambot.auth.model.Auths;


public interface AuthRepository {
    @InsertProvider(type = AuthRepositoryProvider.class, method = "InsertAuthBuilder")
    
    void addNewAuth(@Param("auth") Auths auths);
}
