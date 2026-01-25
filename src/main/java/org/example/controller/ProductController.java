package org.example.controller;

import org.example.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController

public class ProductController {
    public String getStudentDetails(){

        return "This is a Product page";
    }
    @GetMapping("/products")
    List<Product> getAllProducts(){
      return  Arrays.asList(
                new Product("laptop",12000.0,"High performance Laptop","laptop.jpg"),
                new Product("Apple",2000.0,"High performance Apple","Apple.jpg"),
                new Product("T-shirt",6000.0," Beautiful T-shirt","laptop.jpg")

        );


    }
}
