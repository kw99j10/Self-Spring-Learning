package com.camp.di.driveTest.Service.car;

import com.camp.di.driveTest.CarService;
import com.camp.di.driveTest.OutputService;
import org.springframework.stereotype.Service;

//@Service
public class ElecCarService implements CarService {

    private final OutputService outputService;

    public ElecCarService(OutputService outputService) {
        this.outputService = outputService;
    }

    @Override
    public void turnOn() {
        outputService.print("전기차 운행을 시작합니다.");
    }

    @Override
    public void drive() {
        outputService.print("전기차를 운전 중입니다.");
    }

    @Override
    public void stop() {
        outputService.print("전기차를 정지하였습니다.");
    }

    @Override
    public void turnOff() {
        outputService.print("전기차 운행을 종료합니다.");
    }

    @Override
    public void chargeFuel() {
        outputService.print("전기차의 연료를 충전합니다");
    }
}
