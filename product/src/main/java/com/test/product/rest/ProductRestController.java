package com.test.product.rest;

import com.test.product.beans.Product;
import com.test.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductRestController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/sporty/rest/products")
    public ResponseEntity getProductsByRequestParam(@RequestParam("name") String name){
        List<Product> products = productRepository.searchByName(name);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/sporty/rest/products/{id}")
    public ResponseEntity getProductsByPathVariable(@PathVariable("name") String name){
        List<Product> products = productRepository.searchByName(name);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    /*public List<Product> getProducts(){
        //call product repository
        List<Product> products = new ArrayList<>();
        productRepository.findAll().
                forEach(product -> products.add(product));

        return products;
    }*/
}
