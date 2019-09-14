package com.zcl.pattern.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class LogProxy implements InvocationHandler {
  private Object target;

  public Object getInstance(Object target) throws Exception {
    this.target = target;
    Class<?> clazz = target.getClass();
    return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

    System.out.println(
        "begin to invoke method:" + method.getName() + " params:" + Arrays.toString(args));
    Object result = method.invoke(this.target, args);
    System.out.println("invoke " + method.getName() + " end");
    return result;
  }
}
