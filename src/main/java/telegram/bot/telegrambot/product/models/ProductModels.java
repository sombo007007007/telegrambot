package telegram.bot.telegrambot.product.models;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ProductModels {
    private Long id;
    private String file;
    private String title;
    private Long cateId;
    private String video;
    private Boolean status;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
