package pl.jjr.tomwodz.springrepeat;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Component;
import pl.jjr.tomwodz.springrepeat.itunes.itunes.service.ItunesService;
import pl.jjr.tomwodz.springrepeat.sampleshawnmendes.service.ShawnMendesService;

@Component
public class MainApplicationRunner {

    private final ItunesService itunesService;
    private final ShawnMendesService shawnMendesService;

    MainApplicationRunner(ItunesService itunesService, ShawnMendesService shawnMendesService){
        this.itunesService = itunesService;
        this.shawnMendesService = shawnMendesService;
    }

    public void run() throws JsonProcessingException {
        itunesService.fetchShawnMendesSongs();
       shawnMendesService.testClient();
    }
}
