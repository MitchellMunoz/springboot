package com.example.my_spring_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "<html><head><title>Spring Boot REST Service</title>" +
               "<style>" +
               "body { font-family: Arial, sans-serif; max-width: 800px; margin: 0 auto; padding: 20px; }" +
               ".api-demo { background: #f8f9fa; padding: 20px; border-radius: 8px; margin: 20px 0; }" +
               ".endpoint { background: #e9ecef; padding: 10px; border-radius: 4px; margin: 10px 0; font-family: monospace; }" +
               "a { color: #007bff; text-decoration: none; }" +
               "a:hover { text-decoration: underline; }" +
               "</style></head>" +
               "<body>" +
               "<h1 style='color: #2c3e50;'>🚀 Spring Boot REST Service</h1>" +
               "<p style='font-size: 18px; color: #7f8c8d;'>Successfully deployed at springboot.mitchmunoz.com!</p>" +
               "<p style='font-size: 16px; color: #95a5a6;'>Running on port 8002 with SSL enabled</p>" +
               
               "<div class='api-demo'>" +
               "<h2>🔗 Available REST Endpoints</h2>" +
               "<div class='endpoint'>" +
               "<strong>GET</strong> <a href='/greeting' target='_blank'>/greeting</a><br>" +
               "Returns: {\"id\":1,\"content\":\"Hello, World!\"}" +
               "</div>" +
               "<div class='endpoint'>" +
               "<strong>GET</strong> <a href='/greeting?name=Spring' target='_blank'>/greeting?name=Spring</a><br>" +
               "Returns: {\"id\":2,\"content\":\"Hello, Spring!\"}" +
               "</div>" +
               "<div class='endpoint'>" +
               "<strong>GET</strong> <a href='/api/status' target='_blank'>/api/status</a><br>" +
               "Returns: {\"status\":\"running\",\"service\":\"springboot-app\",\"port\":8002}" +
               "</div>" +
               "</div>" +
               
               "<hr style='margin: 30px 0;'>" +
               "<p style='font-size: 14px; color: #bdc3c7;'>" +
               "Built with Spring Boot 3.5.5 | Java 17 | Gradle | REST Service Demo</p>" +
               "</body></html>";
    }

    @GetMapping("/api/status")
    public String status() {
        return "{\"status\":\"running\",\"service\":\"springboot-app\",\"port\":8002}";
    }
}
