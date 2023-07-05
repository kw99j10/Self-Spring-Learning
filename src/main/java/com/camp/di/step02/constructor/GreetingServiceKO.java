package com.camp.di.step02.constructor;

public class GreetingServiceKO implements GreetingService {
    private  OutputService outputService;

    public GreetingServiceKO(OutputService outputService) {
        this.outputService=outputService;
        System.out.println("GreetingServiceK0");
    }
    @Override
    public void sayHello(String name) {
       outputService.print("안녕 "+name);
    }
}
