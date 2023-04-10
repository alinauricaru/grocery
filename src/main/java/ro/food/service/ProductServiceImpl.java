package ro.food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.food.model.dto.ProductDto;
import ro.food.model.entity.Product;
import ro.food.repository.ProductRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductDto> getProducts() {
        List<Product> products = productRepository.findAll();
        List<ProductDto> dtoList = products.stream()
                .map(productEntity -> {
                    ProductDto dto = new ProductDto();
                    dto.setName(productEntity.getName());
                    dto.setBrand(productEntity.getBrand());
                    dto.setNrBuc(productEntity.getNrbuc());
                    return dto;
                })
                .collect(Collectors.toList());
        return dtoList;
    }

    @Override
    public ProductDto getById(Integer id) {
        Optional<Product> product = productRepository.findById(id);
        return product.map( (Product p) -> {
            ProductDto dto = new ProductDto();
            dto.setName((p.getName()));
            dto.setBrand(p.getBrand());
            dto.setNrBuc(p.getNrbuc());
            return dto;
        }).orElse(new ProductDto());

    }
}
