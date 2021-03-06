package za.co.fnb.nav.is.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import za.co.fnb.nav.is.sfgdi.services.GreetingService;

@Controller
public class MyController {

    private  final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreetings();
    }
}
