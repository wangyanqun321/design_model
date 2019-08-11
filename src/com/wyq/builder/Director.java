package com.wyq.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct(){
        builder.buildName("zs");
        builder.buildPrice(12.2);
        builder.buildNumber(10);
        return builder.getResult();
    }

}
