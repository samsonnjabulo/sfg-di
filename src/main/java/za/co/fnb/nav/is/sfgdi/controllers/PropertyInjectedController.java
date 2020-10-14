package za.co.fnb.nav.is.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import za.co.fnb.nav.is.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {

    /*@Qualifier("propertyInjectedGreetingServiceImpl")*/
    @Autowired
    public GreetingService constructorGreetingServices;

    public String getGreetings(){
        return constructorGreetingServices.sayGreetings();
    }
}
