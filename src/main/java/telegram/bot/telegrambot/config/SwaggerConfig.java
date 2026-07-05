package telegram.bot.telegrambot.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Telegram Bot API",
                version = "1.0.0",
                description = "Telegram Bot REST API Documentation",
                contact = @Contact(
                        name = "Sombo",
                        email = "sombo@example.com"
                )
        )
)

public class SwaggerConfig {

}
