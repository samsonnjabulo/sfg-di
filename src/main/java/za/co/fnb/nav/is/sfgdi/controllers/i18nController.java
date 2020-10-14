package za.co.fnb.nav.is.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import za.co.fnb.nav.is.sfgdi.services.GreetingService;

@Controller
public class i18nController {

    private final GreetingService greetingService;

    public i18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreetings();
    }
}
