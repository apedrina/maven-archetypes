package br.com.cielo.pfi.web.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "PFI/Broto API",
                description = "Paltaforma de Financiamento e Investimento"
        )
)
class OpenApiConfig {

}
