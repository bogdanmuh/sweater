package sweater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.lang.*;
import java.util.Properties;

@SpringBootApplication
public class Application {


    public static void main(String[] args) {
        Properties d= System.getProperties();
        SpringApplication.run(Application.class, args);
    }

}