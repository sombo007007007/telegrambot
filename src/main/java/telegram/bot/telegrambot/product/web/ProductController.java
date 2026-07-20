package telegram.bot.telegrambot.product.web;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import telegram.bot.telegrambot.product.models.ProductModels;
import telegram.bot.telegrambot.product.service.ProductServiceImpl.ProductServiceImpl;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductServiceImpl productServiceImpl;

    @Operation
    @GetMapping("/v1/product")
    public ResponseEntity<List<ProductModels>> index_product(){
     return ResponseEntity.ok(
        productServiceImpl.FindAll()
     );
    }

    @Operation
    @PostMapping("/v1/product")
    public ResponseEntity<Map<String,String>> store_product(){
        return ResponseEntity.ok(
            Map.of("message","Store Successfully")
        );
    }
}
