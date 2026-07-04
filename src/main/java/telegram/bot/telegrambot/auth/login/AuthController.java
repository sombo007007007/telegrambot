package telegram.bot.telegrambot.auth.login;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @GetMapping("/index_auth")
    public ResponseEntity<Map<String,String>> auth_index(){
        return ResponseEntity.ok(
            Map.of("massage","Hello API BOT")
        );
    }

}
