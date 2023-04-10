package ro.food.service;

import ro.food.model.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> getProducts();

    ProductDto getById(Integer id);
}
