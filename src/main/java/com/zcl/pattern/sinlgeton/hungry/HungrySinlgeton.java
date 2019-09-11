package com.zcl.pattern.sinlgeton.hungry;

public class HungrySinlgeton {
    private  static  final  HungrySinlgeton  hungrySingleton = new HungrySinlgeton();

    private  HungrySinlgeton(){}

    public  static  HungrySinlgeton getInstance(){
        return hungrySingleton;
    }
}
