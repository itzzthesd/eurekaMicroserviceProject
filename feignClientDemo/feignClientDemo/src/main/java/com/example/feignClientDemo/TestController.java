package com.example.feignClientDemo;

import org.apache.hc.core5.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/client1")
public class TestController {

    @GetMapping("/test")
   public ResponseEntity<String> hitTestApi(){
    System.out.println("api hit");
     return ResponseEntity.ok("api hit from the first client.");
    }
    
}   
