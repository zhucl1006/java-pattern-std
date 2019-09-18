package com.zcl.pattern.strategy;

import java.util.HashMap;
import java.util.Map;
//策略
public class PayStrategy {
    public  static  final  String ALI_PAY = "AliPay";
    public  static  final String JD_PAY = "JDPay";
    public  static  final String DEFAULT = "AliPay";
    //单例，懒汉式
    private static Map<String,Payment> paymentMap = new HashMap<String, Payment>();
    static {
        paymentMap.put(ALI_PAY,new AliPay());
        paymentMap.put(JD_PAY,new JDPay());
    }

    public  static  Payment get(String payKey){
        if(!paymentMap.containsKey(payKey)){
            return paymentMap.get(DEFAULT);
        }
        return paymentMap.get(payKey);
    }
}
