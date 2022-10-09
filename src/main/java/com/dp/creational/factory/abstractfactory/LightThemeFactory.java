package com.dp.creational.factory.abstractfactory;

public class LightThemeFactory implements ThemeFactory{
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LightCheckBox();
    }
}
