package pl.jjr.tomwodz.springrepeat.itunes.itunes.service;

import org.springframework.stereotype.Service;
import pl.jjr.tomwodz.springrepeat.itunes.itunes.proxy.ItunesProxy;
import pl.jjr.tomwodz.springrepeat.itunes.itunes.proxy.ItunesResponse;


@Service
public class ItunesService {
    
    ItunesProxy ItunesClient;

    ItunesMapper itunesMapper;

    public ItunesService(ItunesProxy itunesClient, ItunesMapper itunesMapper) {
        ItunesClient = itunesClient;
        this.itunesMapper = itunesMapper;
    }

    public void fetchShawnMendesSongs() {
    String json = ItunesClient.makeRequest("shawnmendes", 4);
        if(json != null){
        ItunesResponse shawnMendesResponse = itunesMapper.mapJsonToItunesResponse(json);
        System.out.println(shawnMendesResponse);
    }
    }

}
