package pl.jjr.tomwodz.springrepeat.sampleshawnmendes.proxy;

import org.springframework.stereotype.Component;
import pl.jjr.tomwodz.springrepeat.myresttemplate.RestTemplate;

@Component
public class SampleShawnMendesServerProxy {

    private  final RestTemplate restTemplate;

    public SampleShawnMendesServerProxy(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /*  @Value("${sample-shawn-mendes-server.service.url}")
    String url;

    @Value("${sample-shawn-mendes-server.service.port}")
    int port;*/

    public String makePostRequest() {
        System.out.println("Tutaj");
       /* UriComponentsBuilder builder = UriComponentsBuilder
                .newInstance()
                .scheme("http")
                .host(url)
                .port(port)
                .path("/shawn/songs");
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("requestId", "test");
        SampleShawnMendesRequest requestBody = new SampleShawnMendesRequest("test test test");
        HttpEntity<SampleShawnMendesRequest> httpEntity = new HttpEntity<>(requestBody, httpHeaders);

        try {
            ResponseEntity<String> response = restTemplate.exchange(
                    builder.build().toUri(),
                    HttpMethod.POST,
                    httpEntity,
                    String.class);
            return response.getBody();
        } catch (RestClientResponseException exception) {
            System.out.println(exception.getStatusText() + " " + exception.getStatusCode().value());
        } catch (RestClientException exception) {
            System.out.println(exception.getMessage());
        }
        return null;*/
        return "SampleShawnMendesServerProxy 1";
    }

    public String makeGetRequest() {
      /*  UriComponentsBuilder builder = UriComponentsBuilder
                .newInstance()
                .scheme("http")
                .host(url)
                .port(port)
                .path("/shawn/songs");
        try {
            ResponseEntity<String> response = restTemplate.exchange(
                    builder.build().toUri(),
                    HttpMethod.GET,
                    null,
                    String.class);
            return response.getBody();
        } catch (RestClientResponseException exception) {
            System.out.println(exception.getStatusText() + " " + exception.getStatusCode().value());
        } catch (RestClientException exception) {
            System.out.println(exception.getMessage());
        }
        return null;*/
        return "SampleShawnMendesServerProxy 2";
    }

    public String makeDeleteRequest(String id) {
       /* UriComponentsBuilder builder = UriComponentsBuilder
                .newInstance()
                .scheme("http")
                .host(url)
                .port(port)
                .path("/shawn/songs/")
                 .path(id);
        //queryParam("iD",id);
        try {
            ResponseEntity<String> response = restTemplate.exchange(
                    builder.build().toUri(),
                    HttpMethod.DELETE,
                    null,
                    String.class);
            return response.getBody();
        } catch (RestClientResponseException exception) {
            System.out.println(exception.getStatusText() + " " + exception.getStatusCode().value());
        } catch (RestClientException exception) {
            System.out.println(exception.getMessage());
        }
        return null;*/
        return "SampleShawnMendesServerProxy 3";
    }
}
