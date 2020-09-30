package za.co.fnb.nav.is.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.co.fnb.nav.is.sfgdi.services.ConstructorGreetingServicesImpl;

class ConstructorInjectedControllerTest {

    private ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingServicesImpl());
    }

    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());
    }
}