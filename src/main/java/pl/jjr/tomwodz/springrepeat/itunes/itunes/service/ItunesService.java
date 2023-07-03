package pl.jjr.tomwodz.springrepeat.itunes.itunes.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;
import pl.jjr.tomwodz.springrepeat.itunes.itunes.proxy.ItunesProxy;
import pl.jjr.tomwodz.springrepeat.itunes.itunes.proxy.ItunesResponse;


@Service
public class ItunesService {
    
    private final ItunesProxy ItunesClient;

   private final ItunesMapper itunesMapper;

    public ItunesService(ItunesProxy itunesClient, ItunesMapper itunesMapper) {
        ItunesClient = itunesClient;
        this.itunesMapper = itunesMapper;
    }

    public void fetchShawnMendesSongs() throws JsonProcessingException {
    String json = ItunesClient.makeGetRequest("shawnmendes", 4);
        if(json != null){
        ItunesResponse shawnMendesResponse = itunesMapper.mapJsonToItunesResponse(json);
        System.out.println(shawnMendesResponse);
    }
    }

}
