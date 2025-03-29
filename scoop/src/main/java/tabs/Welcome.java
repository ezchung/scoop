package tab;

import org.springframework.stereotype.Component;
//Essentially this header allows the welcome class to be available to spring 

@Component
public class Welcome {

    public String getWelcomeMesage(){
        return "Welcome Dude";
    }
}