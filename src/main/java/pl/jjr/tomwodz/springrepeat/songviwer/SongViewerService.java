package pl.jjr.tomwodz.springrepeat.songviwer;

import org.springframework.stereotype.Service;
import pl.jjr.tomwodz.springrepeat.itunes.itunes.proxy.ItunesResult;
import pl.jjr.tomwodz.springrepeat.itunes.itunes.service.ItunesService;
import pl.jjr.tomwodz.springrepeat.sampleshawnmendes.service.ShawnMendesService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class SongViewerService {

    private final ItunesService itunesService;
    private final ShawnMendesService shawnMendesService;


    public SongViewerService(ItunesService itunesService, ShawnMendesService shawnMendesService) {
        this.itunesService = itunesService;
        this.shawnMendesService = shawnMendesService;
    }

    public List<Song> viewAllSongs() {
        List<Song> songsToView = new ArrayList<>();
        List<ItunesResult> itunesResults = itunesService.fetchShawnMendesSongsFromItunes();
        String songs = shawnMendesService.fetchAllShawnMendesSongsFromLocalhost();
        itunesResults.forEach(
                itunesResult -> songsToView.add(new Song(itunesResult.trackName()))
        );
        songsToView.add(new Song(songs));
        return songsToView;
    }
}
