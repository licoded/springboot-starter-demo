package site.licoded.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages={
                "site.licoded.demo",
                "site.licoded.starter"
        }
)
public class SpringbootStarterDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStarterDemoApplication.class, args);
    }

}
