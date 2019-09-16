package com.zcl.pattern.delegate;

public class EmpA implements IEmp {
    @Override
    public void doing(String command) {
    System.out.println("我是员工A,我执行算法");
    }
}
