package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class ProductController {
    @GetMapping("/product")
    public String getStudentDetails(){

        return "This is a Product page";
    }
}
