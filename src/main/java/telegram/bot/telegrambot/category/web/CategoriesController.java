package telegram.bot.telegrambot.category.web;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.RequestBody;
import lombok.RequiredArgsConstructor;
import telegram.bot.telegrambot.category.models.Categories;
import telegram.bot.telegrambot.category.services.serviceimpl.ServiceCategoriesImpl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequiredArgsConstructor
public class CategoriesController {
    private final ServiceCategoriesImpl categoriesImpl;

    @Operation
    @GetMapping("/index_category")
    public ResponseEntity<List<Categories>> index_category(){
        return ResponseEntity.ok(
            categoriesImpl.findAll()
        );
    }

    @Operation
    @PostMapping("/store_category")
    public ResponseEntity<Map<String, String>> store_category(@RequestBody Categories categories){
        categoriesImpl.addNewCategory(categories);
        return ResponseEntity.ok(
            Map.of("message","Store Successfully")
        );
    }
   
    
}
