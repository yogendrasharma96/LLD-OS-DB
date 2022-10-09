package com.dp.creational.factory.method;

public class PrimaryButtonFactory extends ButtonFactory{
    @Override
    public Button createButton() {
        return new PrimaryButton();
    }
}
