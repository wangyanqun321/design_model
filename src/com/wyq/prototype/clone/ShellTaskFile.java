package com.wyq.prototype.clone;

import java.time.Instant;

public class ShellTaskFile extends AbstractTaskFile {

    public ShellTaskFile(String name, Instant crateAt) {
        super(name, crateAt);
    }

    public String getType(){
        return "shell";
    }

}
