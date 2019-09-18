package com.zcl.pattern.strategy;

public class AliPay extends  Payment{
    @Override
    public String getName() {
        return "AliPay";
    }

    @Override
    public double queryBalance(String uid) {
        return 1200;
    }


}
