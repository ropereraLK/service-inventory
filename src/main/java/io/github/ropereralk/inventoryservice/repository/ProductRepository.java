package io.github.ropereralk.inventoryservice.repository;

import io.github.ropereralk.inventoryservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {


}
