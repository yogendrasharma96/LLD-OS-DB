package com.dp.creational.singleton;

public class LazyLoadingDoubleLocking {


    private static LazyLoadingDoubleLocking lazyLoadingDoubleLocking = null;

    private LazyLoadingDoubleLocking() {
    }

    public static LazyLoadingDoubleLocking getInstance() {
        if (lazyLoadingDoubleLocking == null) {
            synchronized (LazyLoadingDoubleLocking.class) {
                if (lazyLoadingDoubleLocking == null)
                    lazyLoadingDoubleLocking = new LazyLoadingDoubleLocking();
            }
        }
        return lazyLoadingDoubleLocking;

    }

}
