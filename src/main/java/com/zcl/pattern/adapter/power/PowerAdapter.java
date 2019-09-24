package com.zcl.pattern.adapter.power;

public class PowerAdapter implements DC5 {
    private  AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5V() {
        int adapterInput = this.ac220.outputAC220();
        int adapterOutput = adapterInput/44;
    System.out.println("使用输入：" + adapterInput + " 转为：" + adapterOutput);
        return adapterOutput;
    }
}
