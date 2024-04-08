package dev.yash.productservice.services;

import dev.yash.productservice.models.Product;
import java.util.List;
public interface ProductService {
    Product getProductById(Long id);
    List<Product> getAllProducts();
}
