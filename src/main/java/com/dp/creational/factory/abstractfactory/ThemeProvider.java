package com.dp.creational.factory.abstractfactory;

public class ThemeProvider {
    public static ThemeFactory getThemeFactory(Themetype themetype){
        switch (themetype){
            case DARK:
                return new DarkThemeFactory();
            case LIGHT:
                return new LightThemeFactory();
        }
        throw  new RuntimeException("Invalid Theme");
    }
}
