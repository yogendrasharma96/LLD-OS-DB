package com.os.semaphoresolution;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Queue;
import java.util.concurrent.Semaphore;

@AllArgsConstructor
@Getter
public class Consumer implements Runnable {
    private Queue<UnitOfWork> store;
    private int maxSize;
    private String name;
    private Semaphore forProducer;
    private Semaphore forConsumer;

    @Override
    public void run() {
        while (true) {
            try {
                forConsumer.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //if(!store.isEmpty())
            store.remove();
            System.out.println("Consumer " + name + " left units " + store.size());
            forProducer.release();
        }

    }
}
