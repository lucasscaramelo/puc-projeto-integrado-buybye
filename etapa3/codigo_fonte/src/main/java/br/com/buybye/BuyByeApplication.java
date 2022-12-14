package br.com.buybye;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("br.com.buybye.adapter.database.entities")
@EnableJpaRepositories("br.com.buybye.adapter.database.repository")
public class BuyByeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuyByeApplication.class, args);
    }
}
