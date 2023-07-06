package com.camp.di.driveTest.Service.output;

import com.camp.di.driveTest.OutputService;
import org.springframework.stereotype.Service;

@Service
public class OutputServiceConsole implements OutputService {
    @Override
    public void print(String msg) {
        System.out.println(msg);
    }
}
