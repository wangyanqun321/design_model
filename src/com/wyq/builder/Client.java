package com.wyq.builder;

public class Client {

    public static void main(String[] args) {
        Builder builder = new ProductBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        System.out.println(product);

    }
}
