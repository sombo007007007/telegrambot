package telegram.bot.telegrambot.category.web;

import java.util.List;
import java.util.Map;

import javax.swing.Spring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.RequestBody;
import lombok.RequiredArgsConstructor;
import telegram.bot.telegrambot.category.models.Categories;
import telegram.bot.telegrambot.category.repository.RepositoryCategories;
import telegram.bot.telegrambot.category.services.serviceimpl.ServiceCategoriesImpl;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequiredArgsConstructor
public class CategoriesController {
    private final RepositoryCategories repositoryCategories;
    // get ServiceCategoriesImpl
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

    // Edit Category // get repositoryImpl 
    @Operation
    @GetMapping("{id}/edits")
    public ResponseEntity<Categories> edit_category(@PathVariable Long id){
        return ResponseEntity.ok(
            categoriesImpl.CategoryByID(id)
        );
    }
    // Update Category // call serverimpl
    @Operation
    @PutMapping("/update")
    public ResponseEntity<Map<String, String>> update_category(@RequestBody Categories categories){
        categoriesImpl.UpdateCategory(categories);
        
        return ResponseEntity.ok(
            Map.of("message","Update Successfully")
        );
    }
    // Delete Category // Call repos
    @Operation
    @DeleteMapping("{id}/delete")
    public ResponseEntity<Map<String, String>>delete_categories(@PathVariable Long id){
        categoriesImpl.DeleteCategory(id);
        return ResponseEntity.ok(
            Map.of("message", "Delete Successfully")
        );
    }
    
}
