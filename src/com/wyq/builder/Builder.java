package com.wyq.builder;

public abstract class Builder {
    protected Product product = new Product();

    abstract void buildName(String name);

    abstract void buildPrice(double price);

    abstract void buildNumber(int number);

    public Product getResult(){
        return product;
    }
}
