package fr.epsi.b3.demo;

import fr.epsi.b3.demo.service.BavardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/")
public class DemoApplication {
    private BavardService bavardService;

    @Autowired
    public DemoApplication(BavardService bavardService) {
        this.bavardService = bavardService;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("hello")
    public String hello() {
        return "Bonjour, monde";
    }

    @GetMapping("/blabla")
    public String blabla() {
        return bavardService.parler();
    }
}
