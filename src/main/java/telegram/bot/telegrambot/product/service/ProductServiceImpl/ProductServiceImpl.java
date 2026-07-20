package telegram.bot.telegrambot.product.service.ProductServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import telegram.bot.telegrambot.product.models.ProductModels;
import telegram.bot.telegrambot.product.repository.ProductRepository;
import telegram.bot.telegrambot.product.service.ProdectService;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProdectService {
    private final ProductRepository productRepository;
    @Override
    public void DeleteNewProduct(Long id) {
        
    }

    @Override
    public List<ProductModels> FindAll() {
        return productRepository.select();
    }

    @Override
    public ProductModels ProductByID(Long id) {
        return null;
    }

    @Override
    public void UpdateNewProduct(ProductModels productModels) {
    }

    @Override
    public void addNewProduct(ProductModels productModels) {
    }

}
