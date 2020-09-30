package za.co.fnb.nav.is.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServicesImpl implements ConstructorGreetingServices {

    @Override
    public String sayGreetings(){
        return "Hello world from Constructor Injected Greetings";
    }
}
