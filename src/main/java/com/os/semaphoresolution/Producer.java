package com.os.semaphoresolution;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Queue;
import java.util.concurrent.Semaphore;

@AllArgsConstructor
@Getter
public class Producer implements Runnable {

    private Queue<UnitOfWork> store;
    private int maxSize;
    private String name;
    private Semaphore forProducer;
    private Semaphore forConsumer;

    @Override
    public void run() {
        while (true) {
            try {
                forProducer.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.add(new UnitOfWork());
            System.out.println("Producer " + name + " left units " + store.size());
            forConsumer.release();
        }
    }
}
