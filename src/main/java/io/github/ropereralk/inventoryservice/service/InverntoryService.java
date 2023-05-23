package io.github.ropereralk.inventoryservice.service;

import io.github.ropereralk.inventoryservice.entity.Product;
import io.github.ropereralk.inventoryservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InverntoryService {

    @Autowired
    ProductRepository productRepository;
    public List<Product> getProductList() {

       return  productRepository.findAll();

    }
}
