package telegram.bot.telegrambot.auth.model;



import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Auths {

private Long id;
private String name;
private String email;
private String password;
private String confirmPassword;
private Boolean status;
private LocalDateTime createdAt;
private LocalDateTime updatedAt;
}
