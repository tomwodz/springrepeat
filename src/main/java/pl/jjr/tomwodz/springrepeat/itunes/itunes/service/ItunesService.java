package pl.jjr.tomwodz.springrepeat.itunes.itunes.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import pl.jjr.tomwodz.springrepeat.itunes.itunes.proxy.ItunesProxy;
import pl.jjr.tomwodz.springrepeat.itunes.itunes.proxy.ItunesResponse;
import pl.jjr.tomwodz.springrepeat.itunes.itunes.proxy.ItunesResult;

import java.util.Collections;
import java.util.List;


@Service
@Log4j2
public class ItunesService {
    
    private final ItunesProxy ItunesClient;

   private final ItunesMapper itunesMapper;

    public ItunesService(ItunesProxy itunesClient, ItunesMapper itunesMapper) {
        ItunesClient = itunesClient;
        this.itunesMapper = itunesMapper;
    }
    public List<ItunesResult> fetchShawnMendesSongs() {
    String jsonSongs = ItunesClient.makeGetRequest("shawnmendes", 4);
        if(jsonSongs == null) {
            log.error("jsonSongs was null");
            return Collections.emptyList();
        }
        ItunesResponse shawnMendesResponse = itunesMapper.mapJsonToItunesResponse(jsonSongs);
            log.info("ItunesService fetch:" + shawnMendesResponse);
            return shawnMendesResponse.results();
    }

}
