package com.zcl.pattern.proxy.jdkproxy;

import java.lang.reflect.Method;

public class LogTest {
  public static void main(String[] args) {
    //
    try {
        Object obj = new LogProxy().getInstance(new LogObjectP());//返回代理对象
        Method method = obj.getClass().getMethod("logInfo",null);
        method.invoke(obj);


        ILog log = (ILog)obj;//第二种方式， 直接转为对应的接口
        log.logInfo();

//      LogObjectP obj =(LogObjectP) new LogProxy().getInstance(new LogObjectP());
////      Object obj = lp.getInstance(new LogObject());
//      Method method = obj.getClass().getMethod("logInfo", null);
//      //      lp.invoke(null, method, null);
//      method.invoke(obj);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
