package com.os.mutexsulotion;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Queue;

@AllArgsConstructor
@Getter
public class Consumer implements Runnable {
    private Queue<UnitOfWork> store;
    private int maxSize;
    private String name;

    @Override
    public void run() {
        while (true) {
            synchronized (store) {
                if (store.size() > 0) {
                    store.remove();
                    System.out.println("Consumer " + name + " left units " + store.size());
                }
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
