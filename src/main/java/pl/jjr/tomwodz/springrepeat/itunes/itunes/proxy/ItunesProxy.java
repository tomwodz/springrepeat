package pl.jjr.tomwodz.springrepeat.itunes.itunes.proxy;

import org.springframework.stereotype.Component;
import pl.jjr.tomwodz.springrepeat.myresttemplate.RestTemplate;

@Component
public class ItunesProxy {

    RestTemplate restTemplate;

   /* @Value("${itunes.service.url}")
    String url;

    @Value("${itunes.service.port}")
    String port;*/

    public  ItunesProxy(RestTemplate restTemplate){
        this.restTemplate =restTemplate;
    }

    public String makeRequest(String term, Integer limit) {
/*        UriComponentsBuilder builder = UriComponentsBuilder
                .newInstance()
                .scheme("https")
                .host(url)
                .port(port)
                .path("/search")
                .queryParam("term", "shawnMendes")
                .queryParam("limit", 1);
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
        return "ItunesProxy";
    }


}
