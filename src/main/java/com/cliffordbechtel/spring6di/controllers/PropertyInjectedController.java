package com.cliffordbechtel.spring6di.controllers;

import com.cliffordbechtel.spring6di.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
