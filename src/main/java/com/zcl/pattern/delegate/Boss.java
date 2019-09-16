package com.zcl.pattern.delegate;

public class Boss {
    private  Leader leader = new Leader();
    public  void command(String command){
        leader.doing(command);
    }
}
