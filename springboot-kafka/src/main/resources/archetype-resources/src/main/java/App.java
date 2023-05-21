package io.github.apedrina.kafka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class App {

    public static void main(String[] args) {

        SpringApplication.run(App.class, args);

    }

    @Configuration
    public class EnvironmentConfiguration {

        @Value("${path.jaas}")
        private String path;

        @Bean
        public void kafkaConfig() {
            //System.getProperty("user.dir");
            System.setProperty("java.security.auth.login.config", path);
        }

    }

}

