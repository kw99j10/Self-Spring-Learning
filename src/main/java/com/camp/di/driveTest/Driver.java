package com.camp.di.driveTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Driver {
    private final CarService carService;

    @Autowired
    public Driver(CarService carService) {
        this.carService = carService;
    }

    public void drive(){
        carService.chargeFuel();
        carService.turnOn();
        carService.drive();
        carService.stop();
        carService.turnOff();
    }
    public void charge(){
        carService.chargeFuel();
    }
}
