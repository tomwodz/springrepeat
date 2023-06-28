package pl.jjr.tomwodz.springrepeat.itunes.itunes.service;

import org.springframework.stereotype.Component;
import pl.jjr.tomwodz.springrepeat.itunes.itunes.proxy.ItunesResponse;

import java.util.List;

@Component
public class ItunesMapper {

    ItunesResponse mapJsonToItunesResponse(String json) {
      /*  ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, ItunesResponse.class);*/
        return new ItunesResponse(0, List.of());
    }
}
