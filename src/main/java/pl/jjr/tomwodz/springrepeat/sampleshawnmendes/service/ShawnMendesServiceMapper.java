package pl.jjr.tomwodz.springrepeat.sampleshawnmendes.service;


import org.springframework.stereotype.Component;
import pl.jjr.tomwodz.springrepeat.itunes.itunes.proxy.ItunesResponse;
import pl.jjr.tomwodz.springrepeat.proxy.SampleServerShawnMendesResponse;

import java.util.List;

@Component
class ShawnMendesServiceMapper {
    SampleServerShawnMendesResponse mapJsonToSampleShanMendesResponse(String json) {
/*        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, SampleServerShawnMendesResponse.class);*/
        return new SampleServerShawnMendesResponse("a", List.of());
    }
}
