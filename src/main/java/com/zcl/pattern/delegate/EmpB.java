package com.zcl.pattern.delegate;

public class EmpB implements  IEmp {
    @Override
    public void doing(String command) {
    System.out.println("我是员工B,我执行架构分析");
    }
}
