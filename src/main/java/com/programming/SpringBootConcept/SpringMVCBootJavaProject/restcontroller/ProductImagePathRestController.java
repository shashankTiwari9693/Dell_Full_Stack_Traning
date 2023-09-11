package com.programming.SpringBootConcept.SpringMVCBootJavaProject.restcontroller;

import com.programming.SpringBootConcept.SpringMVCBootJavaProject.beans.Product;
import com.programming.SpringBootConcept.SpringMVCBootJavaProject.exception.LogingFailureException;
import com.programming.SpringBootConcept.SpringMVCBootJavaProject.repository.ProductRepository;
import com.programming.SpringBootConcept.SpringMVCBootJavaProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductImagePathRestController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/hplus/rest/products2/images/{image_path}")
    public ResponseEntity getProductsByPathVariable(@PathVariable("image_path") String image_path) throws LogingFailureException {
        List<Product> products = productRepository.searchByImagePath(image_path);
        if(products !=null){
            System.out.println(products.size());
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
        else{
            System.out.println(products.size());
            return new ResponseEntity<>(products,HttpStatus.NOT_FOUND);

        }
    }
}
