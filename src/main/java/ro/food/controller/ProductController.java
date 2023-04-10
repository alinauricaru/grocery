package ro.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ro.food.model.dto.ProductDto;
import ro.food.service.ProductService;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products") //endpoint
    public List<ProductDto> listProducts() {
        return productService.getProducts();
    }

    @GetMapping("/products/{id}") //bookId este un path variable
    public ProductDto getProductDetails(@PathVariable(value = "id") Integer productId) {
       return productService.getById(productId);

    }
}
