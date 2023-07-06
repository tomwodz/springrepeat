package pl.jjr.tomwodz.springrepeat.sampleshawnmendes.service;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import pl.jjr.tomwodz.springrepeat.sampleshawnmendes.proxy.SampleServerShawnMendesResponse;
import pl.jjr.tomwodz.springrepeat.sampleshawnmendes.proxy.SampleShawnMendesServerProxy;
import pl.jjr.tomwodz.springrepeat.songviwer.Song;
import pl.jjr.tomwodz.springrepeat.songviwer.SongFetchable;

import java.util.List;

@Service
@Log4j2
public class ShawnMendesService implements SongFetchable {


    private final SampleShawnMendesServerProxy sampleShawnMendesServerClient;
    private final ShawnMendesServiceMapper shawnMendesServiceMapper;
    public ShawnMendesService(SampleShawnMendesServerProxy sampleShawnMendesServerClient, ShawnMendesServiceMapper shawnMendesServiceMapper) {
        this.sampleShawnMendesServerClient = sampleShawnMendesServerClient;
        this.shawnMendesServiceMapper = shawnMendesServiceMapper;
    }

    @Override
    public List<Song> fetchAllSongs(){
        String songs = fetchAllShawnMendesSongsFromLocalhost();
        return List.of(new Song(songs));
    }

    private String fetchAllShawnMendesSongsFromLocalhost (){
        String jsonSong = sampleShawnMendesServerClient.makeGetRequest();
        if(jsonSong == null){
            log.error("jsonSong was null");
            return  "";
        }
        SampleServerShawnMendesResponse sampleServerShawnMendesResponse = shawnMendesServiceMapper.mapJsonToSampleShawnMendesResponse(jsonSong);
        log.info("ShawnMendesService fetched: " + sampleServerShawnMendesResponse);
        return sampleServerShawnMendesResponse.message();
    }



}
