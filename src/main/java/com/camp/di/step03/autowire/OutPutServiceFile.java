package com.camp.di.step03.autowire;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class OutPutServiceFile implements OutputService {
    @Override
    public void print(String msg) {

        try (PrintWriter out = new PrintWriter(new FileWriter("msg.txt", true))) {
            out.println(msg);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
