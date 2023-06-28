package pl.jjr.tomwodz.springrepeat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.jjr.tomwodz.springrepeat.sampleshawnmendes.service.ShawnMendesService;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan
public class ResttemplateApplication {

    @Autowired
    MainApplicationRunner mainApplicationRunner;
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ResttemplateApplication.class);
        ShawnMendesService shawnMendesService = annotationConfigApplicationContext.getBean(ShawnMendesService.class);
        shawnMendesService.testClient();

        List<String> singletonNames = Arrays.asList(annotationConfigApplicationContext.getDefaultListableBeanFactory().getSingletonNames());
        singletonNames.forEach(
                System.out::println
        );

        ShawnMendesService bean = annotationConfigApplicationContext.getBean(ShawnMendesService.class);
    }

}
