package pl.jjr.tomwodz.springrepeat.songviwer;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SongViewerService {

    private final List<SongFetchable> services;
    public SongViewerService(List<SongFetchable> songFetchable) {
        this.services = songFetchable;
    }
    public List<Song> viewAllSongs() {
        List<Song> songsToView = new ArrayList<>();
        services.forEach(
               songService -> songsToView.addAll(songService.fetchAllSongs())
               );
        return songsToView;
    }

}
