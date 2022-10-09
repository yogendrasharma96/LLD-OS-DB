package com.db.creational.factory;

import com.dp.creational.factory.abstractfactory.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AbstractFactoryTest {

    @Test
    public void testAbstractFactory(){
        final ThemeFactory themeFactory = ThemeProvider.getThemeFactory(Themetype.LIGHT);
        final Button button = themeFactory.createButton();
        final CheckBox checkBox = themeFactory.createCheckBox();
        assertTrue(button instanceof LightButton);

    }
}
