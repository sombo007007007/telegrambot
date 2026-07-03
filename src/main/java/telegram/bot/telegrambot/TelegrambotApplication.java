package telegram.bot.telegrambot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TelegrambotApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TelegrambotApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
