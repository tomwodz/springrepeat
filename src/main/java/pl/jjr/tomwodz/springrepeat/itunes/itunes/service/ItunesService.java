package pl.jjr.tomwodz.springrepeat.itunes.itunes.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import pl.jjr.tomwodz.springrepeat.itunes.itunes.proxy.ItunesProxy;
import pl.jjr.tomwodz.springrepeat.itunes.itunes.proxy.ItunesResponse;
import pl.jjr.tomwodz.springrepeat.itunes.itunes.proxy.ItunesResult;
import pl.jjr.tomwodz.springrepeat.songviwer.Song;
import pl.jjr.tomwodz.springrepeat.songviwer.SongFetchable;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


@Service
@Log4j2
public class ItunesService implements SongFetchable {
    
    private final ItunesProxy ItunesClient;

   private final ItunesMapper itunesMapper;

    public ItunesService(ItunesProxy itunesClient, ItunesMapper itunesMapper) {
        ItunesClient = itunesClient;
        this.itunesMapper = itunesMapper;
    }

    @Override
    public List<Song> fetchAllSongs(){
        List<ItunesResult> itunesResults = fetchShawnMendesSongsFromItunes();
        return itunesResults.stream()
                .map(itunesResult -> new Song(itunesResult.trackName()))
                .collect(Collectors.toList());
    }
    private List<ItunesResult> fetchShawnMendesSongsFromItunes() {
    String jsonSongs = ItunesClient.makeGetRequest("shawnmendes", 2);
        if(jsonSongs == null) {
            log.error("jsonSongs was null");
            return Collections.emptyList();
        }
        ItunesResponse shawnMendesResponse = itunesMapper.mapJsonToItunesResponse(jsonSongs);
            log.info("ItunesService fetched:" + shawnMendesResponse);
            return shawnMendesResponse.results();
    }



}
