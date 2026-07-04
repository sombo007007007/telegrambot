package telegram.bot.telegrambot.auth.web;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class AuthController {
    @GetMapping("/index_auth")
    public ResponseEntity<Map<String,String>> auth_index(){
        return ResponseEntity.ok(
            Map.of("massage","Hello API BOT")
        );
    }

    @PostMapping("/auth_register")
    public ResponseEntity<Map<String,String>> auth_register (){
       
        return ResponseEntity.ok(
            Map.of("message","Login Sussuccefully")
        );
    }
    

}
