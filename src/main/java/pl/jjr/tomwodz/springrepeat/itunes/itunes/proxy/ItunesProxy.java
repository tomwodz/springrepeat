package pl.jjr.tomwodz.springrepeat.itunes.itunes.proxy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class ItunesProxy {

    private final RestTemplate restTemplate;

    @Value("${itunes.service.url}")
    String url;

    @Value("${itunes.service.port}")
    String port;

    public  ItunesProxy(RestTemplate restTemplate){
        this.restTemplate =restTemplate;
    }

    public String makeGetRequest(String term, Integer limit) {
        UriComponentsBuilder builder = UriComponentsBuilder
                .newInstance()
                .scheme("https")
                .host(url)
                .port(port)
                .path("/search")
                .queryParam("term", "shawnMendes")
                .queryParam("limit", limit);
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
        return null;
    }


}
