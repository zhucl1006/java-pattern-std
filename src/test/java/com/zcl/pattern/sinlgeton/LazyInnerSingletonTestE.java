package com.zcl.pattern.sinlgeton;

import java.lang.reflect.Constructor;

import com.zcl.pattern.sinlgeton.lazy.LazyInnerSingleton;

public class LazyInnerSingletonTestE {
  public static void main(String[] args) {
    //
      //通过反射强制破坏 简单 单例
      try{
          //很无聊的情况下，进行破坏
          Class<?> clazz = LazyInnerSingleton.class;

          //通过反射拿到私有的构造方法
          Constructor c = clazz.getDeclaredConstructor(null);
          //强制访问，强吻，不愿意也要吻
          c.setAccessible(true);

          //暴力初始化
          Object o1 = c.newInstance();

          //调用了两次构造方法，相当于new了两次
          //犯了原则性问题，
          Object o2 = c.newInstance();

          System.out.println(o1 == o2);
          //            Object o2 = c.newInstance();
      }catch (Exception e){
          e.printStackTrace();
      }
  }
}
