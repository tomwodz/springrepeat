package pl.jjr.tomwodz.springrepeat;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import pl.jjr.tomwodz.springrepeat.itunes.itunes.proxy.ItunesProxy;
import pl.jjr.tomwodz.springrepeat.sampleshawnmendes.proxy.SampleShawnMendesServerProxy;

@ComponentScan
public class ResttemplateApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
                ResttemplateApplication.class);
        ItunesProxy itunesProxy= annotationConfigApplicationContext.getBean(ItunesProxy.class);
        System.out.println(itunesProxy.makeGetRequest("shawnmendes",5));

        SampleShawnMendesServerProxy sampleShawnMendesServerProxy = annotationConfigApplicationContext.getBean(SampleShawnMendesServerProxy.class);
        System.out.println(sampleShawnMendesServerProxy.makePostRequest());
        System.out.println(sampleShawnMendesServerProxy.makeGetRequest());
    }

}
