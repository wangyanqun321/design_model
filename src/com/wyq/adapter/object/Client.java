package com.wyq.adapter.object;

public class Client {
    public static void main(String[] args) {
        System.out.println("适配器模式测试");
        Motor motor = new OpticalAdapter(new OpticalMotor());
        motor.driver();
    }
}
