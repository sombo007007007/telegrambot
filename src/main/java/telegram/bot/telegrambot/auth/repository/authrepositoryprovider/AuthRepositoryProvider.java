package telegram.bot.telegrambot.auth.repository.authrepositoryprovider;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

import telegram.bot.telegrambot.auth.model.Auths;

@Repository
@Mapper
public class AuthRepositoryProvider {

   public String InsertAuthBuilder(final Auths auth) {
        return new SQL() {{
            INSERT_INTO("users");

            VALUES("name", "#{name}");
            VALUES("email", "#{email}");
            VALUES("password", "#{password}");
            VALUES("comfirm_password", "#{comfirm_password}");
            VALUES("status", "#{status}");
            VALUES("created_at", "#{createdAT}");
        }}.toString();
    }

}
