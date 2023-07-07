package pl.jjr.tomwodz.springrepeat;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import pl.jjr.tomwodz.springrepeat.songviwer.Song;
import pl.jjr.tomwodz.springrepeat.songviwer.SongViewerService;

import java.util.List;

@Component
@Log4j2
public class MainApplicationRunner {

  private final SongViewerService songViewerService;

    public MainApplicationRunner(SongViewerService songViewerService) {
        this.songViewerService = songViewerService;
    }
    public void start() {
        List<Song> songs = songViewerService.viewAllSongs();
        log.info(songs);
    }
}
