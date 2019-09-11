package com.zcl.pattern.sinlgeton;

import com.zcl.pattern.sinlgeton.hungry.HungrySinlgeton;

public class ExectorThread implements  Runnable{

    @Override
    public void run() {
        System.out.println(HungrySinlgeton.getInstance());
    }
}
