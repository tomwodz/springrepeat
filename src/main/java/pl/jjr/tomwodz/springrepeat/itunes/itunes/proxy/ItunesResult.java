package pl.jjr.tomwodz.springrepeat.itunes.itunes.proxy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ItunesResult(String trackName, String artistName) {
}
