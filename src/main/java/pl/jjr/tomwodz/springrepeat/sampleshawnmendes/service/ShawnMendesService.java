package pl.jjr.tomwodz.springrepeat.sampleshawnmendes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.jjr.tomwodz.springrepeat.proxy.SampleServerShawnMendesResponse;
import pl.jjr.tomwodz.springrepeat.proxy.SampleShawnMendesServerProxy;

@Service
public class ShawnMendesService {


    SampleShawnMendesServerProxy sampleShawnMendesServerClient;
    ShawnMendesServiceMapper shawnMendesServiceMapper;

    public void testClient() {

/*        String postJsonSampleShawnMendesServer = sampleShawnMendesServerClient.makePostRequest();
        if(postJsonSampleShawnMendesServer != null) {
            SampleServerShawnMendesResponse sampleServerShawnMendesResponse = shawnMendesServiceMapper.mapJsonToSampleShanMendesResponse(postJsonSampleShawnMendesServer);
            System.out.println(sampleServerShawnMendesResponse);
        }
        String getJsonSampleShawnMendesServer = sampleShawnMendesServerClient.makeGetRequest();
        if(getJsonSampleShawnMendesServer != null) {
            SampleServerShawnMendesResponse sampleServerShawnMendesResponse = shawnMendesServiceMapper.mapJsonToSampleShanMendesResponse(getJsonSampleShawnMendesServer);
            System.out.println(sampleServerShawnMendesResponse);
        }
        sampleShawnMendesServerClient.makeDeleteRequest("0");
        String getJsonSampleShawnMendesServer2 = sampleShawnMendesServerClient.makeGetRequest();
        if(getJsonSampleShawnMendesServer != null) {
            SampleServerShawnMendesResponse sampleServerShawnMendesResponse = shawnMendesServiceMapper.mapJsonToSampleShanMendesResponse(getJsonSampleShawnMendesServer2);
            System.out.println(sampleServerShawnMendesResponse);
        }*/
    }
}
