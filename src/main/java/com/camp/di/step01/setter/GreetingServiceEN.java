package com.camp.di.step01.setter;

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
