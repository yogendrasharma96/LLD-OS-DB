package com.os.problem;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Queue;

@AllArgsConstructor
@Getter
public class Producer implements Runnable {

    private Queue<UnitOfWork> store;
    private int maxSize;
    private String name;

    @Override
    public void run() {
        while (true) {
            if (store.size() < maxSize) {
                store.add(new UnitOfWork());
                System.out.println("Producer " + name + " left units " + store.size());
            }
        }
    }
}
