package com.example.feignClientDemo2;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/client2")
public class TestController {
    
    public GreetingController greetingController;

    
    public TestController(GreetingController greetingController){
        this.greetingController = greetingController;
    }

    @GetMapping("/test")
    public ResponseEntity<String> getMethodName() {
        System.out.println("second client got hit.");
        return greetingController.test();
    }
    
}
