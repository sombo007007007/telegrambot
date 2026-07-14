package telegram.bot.telegrambot.auth.repository.authrepositoryprovider;

import org.apache.ibatis.jdbc.SQL;

public class AuthProvider {
public String InsertAuthBuilder(){
    return new SQL(){{
        INSERT_INTO("users");
        VALUES("name", "#{au.name}");
        VALUES("email", "#{au.email}");
        VALUES("password", "#{au.password}");
        VALUES("comfirm_password", "#{au.confirmPassword}");
        VALUES("created_at", "#{au.createdAt}");
    }}.toString();
}
}
