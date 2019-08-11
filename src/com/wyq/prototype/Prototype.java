package com.wyq.prototype;

/**
 * Java原型设计模式
 */
public interface Prototype extends Cloneable {

    public Object clone() throws CloneNotSupportedException;
}
