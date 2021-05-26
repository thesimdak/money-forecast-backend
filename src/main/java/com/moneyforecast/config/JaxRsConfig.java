package com.moneyforecast.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JaxRsConfig extends ResourceConfig {
    public JaxRsConfig() {
        packages("com.moneyforecast");
    }
}