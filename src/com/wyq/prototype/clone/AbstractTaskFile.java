package com.wyq.prototype.clone;

import java.time.Instant;

public class AbstractTaskFile implements TaskFile {
    private String name;

    private Instant crateAt;

    public AbstractTaskFile(String name, Instant crateAt) {
        this.name = name;
        this.crateAt = crateAt;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Instant getCrateAt() {
        return crateAt;
    }

    public void setCrateAt(Instant crateAt) {
        this.crateAt = crateAt;
    }

    @Override
    public Object clone(String name) throws CloneNotSupportedException {
        TaskFile taskFile = (TaskFile)super.clone();
        taskFile.setName(name);
        return taskFile;
    }

    @Override
    public String toString() {
        return "AbstractTaskFile{" +
                "name='" + name + '\'' +
                ", crateAt=" + crateAt +
                '}';
    }
}
