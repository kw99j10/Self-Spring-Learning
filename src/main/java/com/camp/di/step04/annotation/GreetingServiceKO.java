package com.camp.di.step04.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceKO implements GreetingService {
    private OutputService outputService;

    @Autowired
    public GreetingServiceKO(OutputService outputService){
        System.out.println("GreetingServiceK0");
        this.outputService = outputService;
    }
    @Override
    public void sayHello(String name) {
        outputService.print("안녕 "+name);
    }

    public void setOutputService(OutputService outputService) {
        System.out.println("setter_outputService: "+outputService.getClass().getName());
        this.outputService = outputService;
    }
}
