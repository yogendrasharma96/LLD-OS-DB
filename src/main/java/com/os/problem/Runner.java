package com.os.problem;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    private static final Set<String> producersName = Stream.of("p1", "p2", "p3").collect(Collectors.toSet());
    private static final Set<String> consumersName = Stream.of("c1", "c2", "c3", "c4").collect(Collectors.toSet());

    public static void main(String[] args) {
        Queue<UnitOfWork> store = new ArrayDeque<>();
        int maxSize = 20;
        Set<Producer> producers = producersName.stream().map(name -> new Producer(store, maxSize, name)).collect(Collectors.toSet());
        Set<Consumer> consumers = consumersName.stream().map(name -> new Consumer(store, maxSize, name)).collect(Collectors.toSet());
        producers.forEach(t -> new Thread(t).start());
        consumers.forEach(t -> new Thread(t).start());

    }

}