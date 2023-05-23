package io.github.ropereralk.inventoryservice.controller;

import io.github.ropereralk.inventoryservice.entity.Product;
import io.github.ropereralk.inventoryservice.service.InverntoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    InverntoryService inverntoryService;

    @GetMapping("/products")
    public List<Product> getProductList() {
        return inverntoryService.getProductList();
    }
}
