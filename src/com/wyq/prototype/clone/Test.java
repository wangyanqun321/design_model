package com.wyq.prototype.clone;

import java.time.Instant;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        TaskFile taskFile = new HiveTaskFile("x", Instant.now());
        System.out.println(taskFile);
        System.out.println(taskFile.clone("y"));
    }
}
