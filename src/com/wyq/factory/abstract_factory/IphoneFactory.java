package com.wyq.factory.abstract_factory;

public class IphoneFactory implements AbstractFactory{
    @Override
    public Phone newPhone() {
        System.out.println("生产iphone手机");
        return new IphonePhone();
    }

    @Override
    public Watch newWatch() {
        System.out.println("生产iphone手表");
        return new IphoneWatch();
    }
}
