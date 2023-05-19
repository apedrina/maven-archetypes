package br.com.cielo.pfi.web.config;

import feign.Client;
import feign.Logger;
import org.springframework.context.annotation.Bean;

public class FeingConfig {

    @Bean
    public Client feignClient() {
        return new Client.Default(null, null);

    }

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}
