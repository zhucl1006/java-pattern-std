package com.zcl.pattern.adapter.loginadapter.v2.adapters;

import com.zcl.pattern.adapter.loginadapter.ResultMsg;

/**
 * Created by Tom on 2019/3/16.
 */
public interface RegistAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
