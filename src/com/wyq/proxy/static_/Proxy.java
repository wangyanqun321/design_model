package com.wyq.proxy.static_;

public class Proxy implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        if(realSubject == null){
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();

    }

    private void preRequest(){
        System.out.println("访问真是主题对象预处理前");
    }

    private void postRequest(){
        System.out.println("访问真是主题对象之后的处理");
    }
}
