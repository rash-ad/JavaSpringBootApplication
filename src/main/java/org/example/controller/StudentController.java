package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class StudentController {
    @GetMapping("/student")
    public String getStudentDetails(){

        return "<h1>Rashad </h1> ";
    }
}

