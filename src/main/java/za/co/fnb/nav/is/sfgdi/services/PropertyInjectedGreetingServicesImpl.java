package za.co.fnb.nav.is.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingServicesImpl implements ConstructorGreetingServices {

    @Override
    public String sayGreetings(){
        return "Hello world from Property Injected Greetings";
    }
}
