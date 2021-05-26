package com.moneyforecast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.moneyforecast")
public class MoneyForecastBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoneyForecastBackendApplication.class, args);
    }

}
