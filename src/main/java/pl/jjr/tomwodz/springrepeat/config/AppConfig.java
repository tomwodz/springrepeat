package pl.jjr.tomwodz.springrepeat.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Objects;

@Configuration
public class AppConfig {
    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper();
    }

}
