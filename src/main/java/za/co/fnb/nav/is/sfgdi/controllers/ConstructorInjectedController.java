package za.co.fnb.nav.is.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import za.co.fnb.nav.is.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {
    private final GreetingService constructorGreetingServices;

    public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService constructorGreetingServices) {
        this.constructorGreetingServices = constructorGreetingServices;
    }
    public String getGreetings(){
        return constructorGreetingServices.sayGreetings();
    }

}
