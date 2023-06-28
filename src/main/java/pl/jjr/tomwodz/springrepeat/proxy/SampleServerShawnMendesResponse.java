package pl.jjr.tomwodz.springrepeat.proxy;

import java.util.List;

public record SampleServerShawnMendesResponse(
        String message,
        List<String> songsName
) {
}
