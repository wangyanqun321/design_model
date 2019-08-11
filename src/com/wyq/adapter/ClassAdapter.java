package com.wyq.adapter;

import com.wyq.prototype.clone.TaskFile;

public class ClassAdapter extends Adapter implements Target {
    @Override
    public void request() {
        sepecificRequest();
    }
}
