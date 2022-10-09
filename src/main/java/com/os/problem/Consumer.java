package com.os.problem;

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
            if (store.size() > 0) {
                store.remove();
                System.out.println("Consumer " + name + " left units " + store.size());
            }
        }
    }
}
