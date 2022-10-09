package com.dp.creational.factory.method;

public class RoundButtonFactory extends ButtonFactory{
    @Override
    public Button createButton() {
        return new RoundButton();
    }
}
