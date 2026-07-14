package telegram.bot.telegrambot.auth.authservice.authserviceImpl;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import telegram.bot.telegrambot.auth.authservice.AuthServices;
import telegram.bot.telegrambot.auth.model.Auths;
import telegram.bot.telegrambot.auth.repository.AuthRepository;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl  implements AuthServices{
    private final AuthRepository authRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Override
    public void addNewAuth(Auths auths) {

        if (!auths.getPassword().equals(auths.getConfirmPassword())) {
            throw new RuntimeException("Password and Confirm Password do not match");
        }
        String encodedPassword = passwordEncoder.encode(auths.getPassword());
        auths.setPassword(encodedPassword);
        auths.setConfirmPassword(null);
        authRepository.Insert(auths);
    }

}
