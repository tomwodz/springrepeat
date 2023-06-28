package pl.jjr.tomwodz.springrepeat.sampleshawnmendes.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.jjr.tomwodz.springrepeat.myresttemplate.RestTemplate;
import pl.jjr.tomwodz.springrepeat.sampleshawnmendes.proxy.SampleShawnMendesServerProxy;

@Configuration
public class ShawnMendesServiceConfig {

    @Bean
    SampleShawnMendesServerProxy sampleShawnMendesServerProxy(){
        return new SampleShawnMendesServerProxy();
    }

    @Bean
    ShawnMendesServiceMapper shawnMendesServiceMapper(){
        return new ShawnMendesServiceMapper();
    }

    @Bean
    ShawnMendesService shawnMendesService(){
        return  new ShawnMendesService(sampleShawnMendesServerProxy(),
                shawnMendesServiceMapper());
    }
}
