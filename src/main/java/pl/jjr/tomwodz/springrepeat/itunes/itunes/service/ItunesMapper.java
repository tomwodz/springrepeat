package pl.jjr.tomwodz.springrepeat.itunes.itunes.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import pl.jjr.tomwodz.springrepeat.itunes.itunes.proxy.ItunesResponse;

import java.util.List;

@Component
public class ItunesMapper {

    ItunesResponse mapJsonToItunesResponse(String json) throws JsonProcessingException{
        ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(json, ItunesResponse.class);
    }
}
