package com.zcl.pattern.sinlgeton;

import com.zcl.pattern.sinlgeton.hungry.HungrySinlgeton;

import lazy.LazyInnerSingleton;
import lazy.LazySimpleSinlgeton;
import threadlocal.ThreadLocalSingleton;

public class ExectorThread implements  Runnable{

    @Override
    public void run() {
//        System.out.println(HungrySinlgeton.getInstance());
//        LazySimpleSinlgeton singleton = LazySimpleSinlgeton.getInstance();
//        LazyInnerSingleton singleton = LazyInnerSingleton.getInstance();

        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);


    }
}
