package org.example.examen20241;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAspectJAutoProxy
@SpringBootApplication
@EnableScheduling
public class Examen20241Application {

    public static void main(String[] args) {
        SpringApplication.run(Examen20241Application.class, args);
    }

}
