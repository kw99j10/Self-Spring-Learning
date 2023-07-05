package com.camp.aop;

import org.springframework.stereotype.Component;

@Component("greeting")
public class GreetingServiceKO implements GreetingService {

    private final OutputService outputService;

    public GreetingServiceKO(OutputService outputService) {
        this.outputService = outputService;
        System.out.println("GreetingServiceKO(OutputService outService)...");
    }

    public void sayHello(String name) {
        outputService.print("안녕 "+name);
    }

    @Override
    public void sayGoodbye(String name) {
        outputService.print("잘가 "+name);
    }

    @Override
    public void smile() {
        outputService.print("호호호~~");
    }
}
