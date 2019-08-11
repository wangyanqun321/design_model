package com.wyq.factory.factory_method;

public class ComputeFactory implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("生成电脑");
        return new Computer();
    }
}
