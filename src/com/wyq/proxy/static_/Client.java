package com.wyq.proxy.static_;

public class Client {

    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.request();
    }
}
