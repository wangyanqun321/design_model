package com.wyq.adapter.object;

/**
 * 光能适配器
 */
public class OpticalAdapter implements Motor {
    private OpticalMotor opticalMotor;

    public OpticalAdapter(OpticalMotor opticalMotor) {
        this.opticalMotor = opticalMotor;
    }

    @Override
    public void driver() {
        opticalMotor.opticalDrive();
    }
}
