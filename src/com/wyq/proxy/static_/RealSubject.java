package com.wyq.proxy.static_;

public class RealSubject implements Subject {

    @Override
    public void request(){
        System.out.println("访问真是主题方法");
    }
}
