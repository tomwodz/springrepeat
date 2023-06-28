package pl.jjr.tomwodz.springrepeat.myresttemplate;

import org.springframework.stereotype.Component;

@Component
public class RestTemplate {

    public String exchange(){
        return "made request";
    }
}
