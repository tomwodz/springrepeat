package pl.jjr.tomwodz.springrepeat.sampleshawnmendes.service;


import pl.jjr.tomwodz.springrepeat.sampleshawnmendes.proxy.SampleServerShawnMendesResponse;

import java.util.List;

class ShawnMendesServiceMapper {
    SampleServerShawnMendesResponse mapJsonToSampleShawnMendesResponse(String json) {
/*        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, SampleServerShawnMendesResponse.class);*/
        return new SampleServerShawnMendesResponse("Respone ShawnMendes", List.of());
    }
}
