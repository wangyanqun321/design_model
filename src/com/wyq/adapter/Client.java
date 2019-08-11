package com.wyq.adapter;

public class Client {

    public static void main(String[] args) {
        System.out.println("适配器模式测试");
        Target target = new ClassAdapter();
        target.request();
    }
}
