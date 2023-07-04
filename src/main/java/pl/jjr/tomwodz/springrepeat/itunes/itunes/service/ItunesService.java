package pl.jjr.tomwodz.springrepeat.itunes.itunes.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import pl.jjr.tomwodz.springrepeat.itunes.itunes.proxy.ItunesProxy;
import pl.jjr.tomwodz.springrepeat.itunes.itunes.proxy.ItunesResponse;


@Service
@Log4j2
public class ItunesService {
    
    private final ItunesProxy ItunesClient;

   private final ItunesMapper itunesMapper;

    public ItunesService(ItunesProxy itunesClient, ItunesMapper itunesMapper) {
        ItunesClient = itunesClient;
        this.itunesMapper = itunesMapper;
    }

    public void fetchShawnMendesSongs() {
    String json = ItunesClient.makeGetRequest("shawnmendes", 4);
        if(json != null){
        ItunesResponse shawnMendesResponse = itunesMapper.mapJsonToItunesResponse(json);
            log.info(shawnMendesResponse);
    }
    }

}
