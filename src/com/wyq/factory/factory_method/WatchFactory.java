package com.wyq.factory.factory_method;

public class WatchFactory implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("生产手表");
        return new Watch();
    }
}
