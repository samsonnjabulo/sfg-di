package za.co.fnb.nav.is.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import za.co.fnb.nav.is.sfgdi.services.ConstructorGreetingServices;

@Controller
public class ConstructorInjectedController {
    private final ConstructorGreetingServices constructorGreetingServices;

    public ConstructorInjectedController(@Qualifier("constructorGreetingServicesImpl") ConstructorGreetingServices constructorGreetingServices) {
        this.constructorGreetingServices = constructorGreetingServices;
    }
    public String getGreetings(){
        return constructorGreetingServices.sayGreetings();
    }

}
