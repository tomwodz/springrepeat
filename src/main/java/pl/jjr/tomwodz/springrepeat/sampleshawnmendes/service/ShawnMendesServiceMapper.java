package pl.jjr.tomwodz.springrepeat.sampleshawnmendes.service;


import org.springframework.stereotype.Component;
import pl.jjr.tomwodz.springrepeat.sampleshawnmendes.proxy.SampleServerShawnMendesResponse;

import java.util.List;

@Component
class ShawnMendesServiceMapper {
    SampleServerShawnMendesResponse mapJsonToSampleShawnMendesResponse(String json) {
/*        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, SampleServerShawnMendesResponse.class);*/
        return new SampleServerShawnMendesResponse("Respone ShawnMendes", List.of());
    }
}
