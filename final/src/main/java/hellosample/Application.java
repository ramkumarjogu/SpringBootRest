package hellosample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleSpringApplication {

    @RequestMapping("/")
    public String home() {
        return "Hello Sample Spring App";
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleSpringApplication.class, args);
    }

}
