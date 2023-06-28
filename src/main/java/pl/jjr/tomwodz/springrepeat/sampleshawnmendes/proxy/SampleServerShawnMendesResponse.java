package pl.jjr.tomwodz.springrepeat.sampleshawnmendes.proxy;

import java.util.List;

public record SampleServerShawnMendesResponse(
        String message,
        List<String> songsName
) {
}
