package com.zcl.pattern.prototype;

import com.zcl.pattern.prototype.simple.PrototypeA;

import java.util.ArrayList;
import java.util.List;

public class simpleTest {

  public static void main(String[] args) {
    //
      // 创建一个具体的需要克隆的对象
      PrototypeA prototypeA = new PrototypeA();
      prototypeA.setAge(20);
      prototypeA.setName("zcl");
      List hobbies = new ArrayList<String>();
      prototypeA.setHobbies(hobbies);
      System.out.println(prototypeA);


      PrototypeA cloneA = prototypeA.clone();
      System.out.println(cloneA);

      System.out.println("克隆对象中的引用类型地址值：" + cloneA.getHobbies());
      System.out.println("原对象中的引用类型地址值：" + prototypeA.getHobbies());
      System.out.println("对象地址比较："+(cloneA.getHobbies() == prototypeA.getHobbies()));

  }
}
