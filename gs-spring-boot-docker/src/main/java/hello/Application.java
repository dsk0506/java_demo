package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
    @Value("${test}")
    private  String test;
    @RequestMapping("/")
    public String home() {
        return test;
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}