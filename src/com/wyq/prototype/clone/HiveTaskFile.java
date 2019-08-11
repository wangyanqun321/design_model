package com.wyq.prototype.clone;

import java.time.Instant;

public class HiveTaskFile extends AbstractTaskFile {

    public HiveTaskFile(String name, Instant crateAt) {
        super(name, crateAt);
    }

    public String getType(){
        return "hive";
    }

}
