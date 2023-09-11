package com.programming.SpringBootConcept.SpringMVCBootJavaProject.restcontroller;

import com.programming.SpringBootConcept.SpringMVCBootJavaProject.beans.Product;
import com.programming.SpringBootConcept.SpringMVCBootJavaProject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//@Controller
@RestController
public class ProductsRestController {
    @Autowired

    private ProductRepository productRepository;

  /*  @GetMapping("/hplus/rest/products")
    @ResponseBody
    public List<Product> getAllProductsFromDatabase() {

        List<Product>products = new ArrayList<>();
        productRepository.findAll().forEach(product ->
                products.add(product));

        return products;*/
    //}
    @GetMapping("/hplus/rest/products")
    public ResponseEntity getListOfProductsByRequestParam(@RequestParam("name") String name){
    List<Product>products = productRepository.searchByName(name);
    return new ResponseEntity<>(products, HttpStatus.OK);
    }
    @GetMapping("/hplus/rest/products/{name}")
    public ResponseEntity getListOfProductsByPathVariable(@PathVariable("name") String name){
        List<Product>products = productRepository.searchByName(name);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

}
