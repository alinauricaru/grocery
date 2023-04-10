package ro.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.food.model.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
