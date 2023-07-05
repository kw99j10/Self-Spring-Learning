package com.camp.di.step01.setter;

public class GreetingServiceKO implements GreetingService {
    private OutputService outputService;

    public GreetingServiceKO(){
        System.out.println("GreetingServiceK0");
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
