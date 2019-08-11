package com.wyq.builder;

public class ProductBuilder extends Builder {


    @Override
    void buildName(String name) {
        System.out.println("builder name");
        product.setName(name);
    }

    @Override
    void buildPrice(double price) {
        System.out.println("builder price");
        product.setPrice(price);
    }

    @Override
    void buildNumber(int number) {
        System.out.println("builder number");
        product.setNumber(number);
    }
}
