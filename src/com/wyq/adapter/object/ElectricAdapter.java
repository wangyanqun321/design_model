package com.wyq.adapter.object;

/**
 * 电能适配器
 */
public class ElectricAdapter implements Motor {
    private ElectricMotor electricMotor;

    public ElectricAdapter(ElectricMotor electricMotor) {
        this.electricMotor = electricMotor;
    }

    @Override
    public void driver() {
        electricMotor.electricDrive();
    }
}
