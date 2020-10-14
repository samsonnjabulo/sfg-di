package za.co.fnb.nav.is.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ZA","default"})
@Service("i18nService")
public class i18nZuluGreetingsImpl implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Sanbona lapho - Zulu";
    }
}
