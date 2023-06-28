package pl.jjr.tomwodz.springrepeat.sampleshawnmendes.service;

import org.springframework.stereotype.Service;
import pl.jjr.tomwodz.springrepeat.sampleshawnmendes.proxy.SampleServerShawnMendesResponse;
import pl.jjr.tomwodz.springrepeat.sampleshawnmendes.proxy.SampleShawnMendesServerProxy;

@Service
public class ShawnMendesService {


    private final SampleShawnMendesServerProxy sampleShawnMendesServerClient;
    private  final ShawnMendesServiceMapper shawnMendesServiceMapper;
    public ShawnMendesService(SampleShawnMendesServerProxy sampleShawnMendesServerClient, ShawnMendesServiceMapper shawnMendesServiceMapper) {
        this.sampleShawnMendesServerClient = sampleShawnMendesServerClient;
        this.shawnMendesServiceMapper = shawnMendesServiceMapper;
    }

    public void testClient() {
        System.out.println("Tutaj 2");
        String postJsonSampleShawnMendesServer = sampleShawnMendesServerClient.makePostRequest();
        if(postJsonSampleShawnMendesServer != null) {
            SampleServerShawnMendesResponse sampleServerShawnMendesResponse = shawnMendesServiceMapper.mapJsonToSampleShawnMendesResponse(postJsonSampleShawnMendesServer);
            System.out.println(sampleServerShawnMendesResponse);
        }
        String getJsonSampleShawnMendesServer = sampleShawnMendesServerClient.makeGetRequest();
        if(getJsonSampleShawnMendesServer != null) {
            SampleServerShawnMendesResponse sampleServerShawnMendesResponse = shawnMendesServiceMapper.mapJsonToSampleShawnMendesResponse(getJsonSampleShawnMendesServer);
            System.out.println(sampleServerShawnMendesResponse);
        }
        sampleShawnMendesServerClient.makeDeleteRequest("0");
        String getJsonSampleShawnMendesServer2 = sampleShawnMendesServerClient.makeGetRequest();
        if(getJsonSampleShawnMendesServer != null) {
            SampleServerShawnMendesResponse sampleServerShawnMendesResponse = shawnMendesServiceMapper.mapJsonToSampleShawnMendesResponse(getJsonSampleShawnMendesServer2);
            System.out.println(sampleServerShawnMendesResponse);
        }
    }
}
