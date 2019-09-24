package com.zcl.pattern.adapter.loginadapter.v2.adapters;


import com.zcl.pattern.adapter.loginadapter.ResultMsg;

/**
 * Created by Tom on 2019/3/16.
 */
public class LoginForQQAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
    System.out.println("login in qq" + adapter);
        return null;
    }
}
