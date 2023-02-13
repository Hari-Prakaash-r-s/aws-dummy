package com.example.demo.Idea.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class NewIdeaController {


    @GetMapping("/")
    @ResponseBody
    public String basic(){
        return "Hii";
    }

}
