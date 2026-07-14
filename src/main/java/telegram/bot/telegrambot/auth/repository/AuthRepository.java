package telegram.bot.telegrambot.auth.repository;


import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import telegram.bot.telegrambot.auth.model.Auths;
import telegram.bot.telegrambot.auth.repository.authrepositoryprovider.AuthProvider;


@Repository
@Mapper
public interface AuthRepository {
    @InsertProvider(type =AuthProvider.class, method = "InsertAuthBuilder")
    void Insert(@Param("au") Auths auths);
}
