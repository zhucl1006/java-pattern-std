package com.zcl.pattern.strategy;

public class JDPay extends  Payment{
    @Override
    public String getName() {
        return "JDPay";
    }

    @Override
    public double queryBalance(String uid) {
        return 100;
    }
}
