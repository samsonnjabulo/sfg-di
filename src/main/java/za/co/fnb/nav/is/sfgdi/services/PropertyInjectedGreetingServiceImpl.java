package za.co.fnb.nav.is.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreetings(){
        return "Hello world from Property Injected Greetings";
    }
}
