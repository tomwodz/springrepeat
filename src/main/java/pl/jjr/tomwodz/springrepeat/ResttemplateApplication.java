package pl.jjr.tomwodz.springrepeat;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
public class ResttemplateApplication {

    public static void main(String[] args)  {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
                ResttemplateApplication.class);
        MainApplicationRunner runner = annotationConfigApplicationContext.getBean(MainApplicationRunner.class);
        runner.run();
    }

}
