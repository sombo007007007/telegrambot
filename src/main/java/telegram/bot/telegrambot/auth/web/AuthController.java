package telegram.bot.telegrambot.auth.web;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import telegram.bot.telegrambot.auth.authservice.authserviceImpl.AuthServiceImpl;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import telegram.bot.telegrambot.auth.model.Auths;


@RestController
@RequiredArgsConstructor
public class AuthController {
    private final AuthServiceImpl authServiceImpl;


    @GetMapping("/index_auth")
    public ResponseEntity<Map<String,String>> auth_index(){
        
        return ResponseEntity.ok(
            Map.of("massage","Hello API BOT")
        );
    }


    @Operation
    @PostMapping("/auth_register")
    public ResponseEntity<Map<String,String>> auth_register (@RequestBody Auths auths){
       authServiceImpl.addNewAuth(auths);
        return ResponseEntity.ok(
            Map.of("message","Login Sussuccefully")
        );
    }
    

}
