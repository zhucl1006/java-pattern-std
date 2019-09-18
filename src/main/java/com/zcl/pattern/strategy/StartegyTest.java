package com.zcl.pattern.strategy;

public class StartegyTest {
  public static void main(String[] args) {
    //
    Order order = new Order("1","202020",300);
      System.out.println(order.pay(PayStrategy.ALI_PAY));
      System.out.println(order.pay(PayStrategy.JD_PAY));
  }
}
