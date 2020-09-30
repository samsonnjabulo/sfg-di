package za.co.fnb.nav.is.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello spring controller");
        return "Hello folks";
    }
}
