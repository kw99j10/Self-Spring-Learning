package com.camp.di.step04.annotation;

import org.springframework.stereotype.Service;

public class GreetingServiceEN implements GreetingService {

    private OutputService outputService;

    @Override
    public void sayHello(String name) {
        outputService.print("Hi "+name);
    }

    public void setOutputService(OutputService outputService) {
        this.outputService = outputService;
    }
}
