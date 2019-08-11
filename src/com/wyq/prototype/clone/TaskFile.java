package com.wyq.prototype.clone;

public interface TaskFile extends Cloneable {

    Object clone(String name) throws CloneNotSupportedException;

    void setName(String name);

}
