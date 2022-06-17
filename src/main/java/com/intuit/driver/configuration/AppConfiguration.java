package com.intuit.driver.configuration;

import com.intuit.driver.services.DriverAccountsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public DriverAccountsService driverAccountsService() {
        return new DriverAccountsService();
    }
}
