package com.wyq.factory.abstract_factory;

public class Test {
    public static void main(String[] args) {
        AbstractFactory factory = new HuaweiFactory();
        factory.newPhone().show();
    }
}
