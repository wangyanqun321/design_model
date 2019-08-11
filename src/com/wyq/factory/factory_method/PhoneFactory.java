package com.wyq.factory.factory_method;

public class PhoneFactory implements AbstractFactory{
    @Override
    public Product newProduct() {
        System.out.println("生产手机");
        return new Phone();
    }
}
