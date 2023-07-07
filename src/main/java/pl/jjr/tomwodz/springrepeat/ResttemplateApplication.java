package pl.jjr.tomwodz.springrepeat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class ResttemplateApplication {

    @Autowired
    MainApplicationRunner runner;

    public static void main(String[] args)  {
        SpringApplication.run(ResttemplateApplication.class, args);
    }
    @EventListener(ApplicationStartedEvent.class)
    public void start(){
        runner.start();
    }

}
