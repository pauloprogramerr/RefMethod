package anotations.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class MinhaConfiguracao {

    @Bean
    public String mensagem() {
        return "Configuração personalizada"; // Configuração personalizada
    }
}

