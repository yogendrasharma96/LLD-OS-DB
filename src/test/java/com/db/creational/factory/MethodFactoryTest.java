package com.db.creational.factory;

import com.dp.creational.factory.method.Button;
import com.dp.creational.factory.method.ButtonFactory;
import com.dp.creational.factory.method.PrimaryButtonFactory;
import org.junit.Test;

public class MethodFactoryTest {

    @Test
    public void factoryTest(){
        ButtonFactory b=new PrimaryButtonFactory();
        Button button=b.createButton();
        button.onClick();
    }
}
