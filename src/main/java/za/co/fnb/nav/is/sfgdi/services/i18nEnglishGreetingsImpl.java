package za.co.fnb.nav.is.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class i18nEnglishGreetingsImpl implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello world";
    }
}
