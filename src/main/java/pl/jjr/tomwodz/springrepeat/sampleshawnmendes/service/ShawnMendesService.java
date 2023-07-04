package pl.jjr.tomwodz.springrepeat.sampleshawnmendes.service;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import pl.jjr.tomwodz.springrepeat.sampleshawnmendes.proxy.SampleServerShawnMendesResponse;
import pl.jjr.tomwodz.springrepeat.sampleshawnmendes.proxy.SampleShawnMendesServerProxy;

@Service
@Log4j2
public class ShawnMendesService {


    private final SampleShawnMendesServerProxy sampleShawnMendesServerClient;
    private final ShawnMendesServiceMapper shawnMendesServiceMapper;
    public ShawnMendesService(SampleShawnMendesServerProxy sampleShawnMendesServerClient, ShawnMendesServiceMapper shawnMendesServiceMapper) {
        this.sampleShawnMendesServerClient = sampleShawnMendesServerClient;
        this.shawnMendesServiceMapper = shawnMendesServiceMapper;
    }

    public void testClient() {
        String postRequest = sampleShawnMendesServerClient.makePostRequest() ;
        if(postRequest != null) {
            SampleServerShawnMendesResponse sampleServerShawnMendesResponse = shawnMendesServiceMapper.mapJsonToSampleShawnMendesResponse(postRequest);
            log.info(sampleServerShawnMendesResponse);
        }
        String getJsonSampleShawnMendesServer = sampleShawnMendesServerClient.makeGetRequest();
        if(getJsonSampleShawnMendesServer != null) {
            SampleServerShawnMendesResponse sampleServerShawnMendesResponse = shawnMendesServiceMapper.mapJsonToSampleShawnMendesResponse(getJsonSampleShawnMendesServer);
            log.info(sampleServerShawnMendesResponse);
        }
        sampleShawnMendesServerClient.makeDeleteRequest("0");
        String getJsonSampleShawnMendesServer2 = sampleShawnMendesServerClient.makeGetRequest();
        if(getJsonSampleShawnMendesServer2 != null) {
            SampleServerShawnMendesResponse sampleServerShawnMendesResponse = shawnMendesServiceMapper.mapJsonToSampleShawnMendesResponse(getJsonSampleShawnMendesServer2);
            log.info(sampleServerShawnMendesResponse);
        }
    }
}
