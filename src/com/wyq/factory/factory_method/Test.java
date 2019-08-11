package com.wyq.factory.factory_method;

public class Test {
    public static void main(String[] args) {
        AbstractFactory factory = new WatchFactory();
        Product product = factory.newProduct();
        product.show();
    }
}
