package telegram.bot.telegrambot.product.service;

import java.util.List;

import telegram.bot.telegrambot.product.models.ProductModels;

public interface ProdectService {
    // List Products
    List<ProductModels> FindAll();
    // Store Products
    void addNewProduct(ProductModels productModels);
    // Edits Products
    ProductModels ProductByID(Long id);
    // Update Products 
    void UpdateNewProduct(ProductModels productModels);
    // Deleted Products
    void DeleteNewProduct(Long id);
}
