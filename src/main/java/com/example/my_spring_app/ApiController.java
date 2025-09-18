package com.example.my_spring_app;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class ApiController {

    @GetMapping("/api/status")
    public String status() {
        return "{\"status\":\"running\",\"service\":\"springboot-app\",\"port\":8002}";
    }
}
