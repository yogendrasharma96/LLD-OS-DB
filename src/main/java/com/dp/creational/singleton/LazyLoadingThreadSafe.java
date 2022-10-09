package com.dp.creational.singleton;

public class LazyLoadingThreadSafe {

    private static LazyLoadingThreadSafe lazyLoadingThreadSafe = null;

    private LazyLoadingThreadSafe() {
    }

    static LazyLoadingThreadSafe getInstance() {
        synchronized (LazyLoadingThreadSafe.class) {
            if (lazyLoadingThreadSafe == null)
                lazyLoadingThreadSafe = new LazyLoadingThreadSafe();
        }
        return lazyLoadingThreadSafe;

    }
}
