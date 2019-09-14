package com.zcl.pattern.sinlgeton.lazy;

public class LazySimpleSinlgeton {

    private  LazySimpleSinlgeton(){

    }

    public  volatile  static    LazySimpleSinlgeton instance = null;

    public  synchronized static  LazySimpleSinlgeton getInstance(){
        if(instance == null){
            instance = new LazySimpleSinlgeton();
        }
        return instance;
    }
}
