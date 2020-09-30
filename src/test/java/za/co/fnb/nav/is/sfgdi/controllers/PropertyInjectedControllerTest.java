package za.co.fnb.nav.is.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.co.fnb.nav.is.sfgdi.services.ConstructorGreetingServicesImpl;

class PropertyInjectedControllerTest {

    private PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.constructorGreetingServices = new ConstructorGreetingServicesImpl();
    }

    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());
    }
}