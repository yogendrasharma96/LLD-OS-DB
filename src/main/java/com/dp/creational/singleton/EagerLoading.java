package com.dp.creational.singleton;

public class EagerLoading {

    private static EagerLoading eagerLoading = new EagerLoading();

    private EagerLoading() {
    }

    public static EagerLoading getInstance() {
        return eagerLoading;
    }
}
