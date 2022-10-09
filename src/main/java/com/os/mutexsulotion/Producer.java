package com.os.mutexsulotion;

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
            synchronized (store) {
                if (store.size() < maxSize) {
                    store.add(new UnitOfWork());
                    System.out.println("Producer " + name + " left units " + store.size());
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
