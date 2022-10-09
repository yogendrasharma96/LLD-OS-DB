package com.db.creational.singleton;

import com.dp.creational.singleton.EagerLoading;
import com.dp.creational.singleton.LazyLoadingDoubleLocking;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonTest {


    @Test
    public void testSingleton(){
        EagerLoading e=EagerLoading.getInstance();
        EagerLoading e1=EagerLoading.getInstance();
        LazyLoadingDoubleLocking lld=LazyLoadingDoubleLocking.getInstance();
        LazyLoadingDoubleLocking lld1=LazyLoadingDoubleLocking.getInstance();
        assertEquals(true,e.hashCode()==e1.hashCode());
        assertEquals(true,lld.hashCode()==lld1.hashCode());
    }
}
