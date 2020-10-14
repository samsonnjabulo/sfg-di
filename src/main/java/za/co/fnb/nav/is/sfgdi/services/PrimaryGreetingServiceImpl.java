package za.co.fnb.nav.is.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello world from Primary Injected Greetings";
    }
}
