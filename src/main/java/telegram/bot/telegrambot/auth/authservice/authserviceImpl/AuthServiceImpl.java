package telegram.bot.telegrambot.auth.authservice.authserviceImpl;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import telegram.bot.telegrambot.auth.authservice.AuthServices;
import telegram.bot.telegrambot.auth.model.Auths;
import telegram.bot.telegrambot.auth.repository.AuthRepository;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl  implements AuthServices{
    private final AuthRepository authRepository;

    @Override
    public void addNewAuth(Auths auths) {
        authRepository.addNewAuth(auths);
    }

}
