package com.wyq.factory.abstract_factory;

public class HuaweiFactory implements AbstractFactory {
    @Override
    public Phone newPhone() {
        System.out.println("生产华为手机");
        return new HuwaweiPhone();
    }

    @Override
    public Watch newWatch() {
        System.out.println("华为手表");
        return new HuaweiWatch();
    }
}
