package com.zcl.pattern.adapter.power;

public class powerTest {
  public static void main(String[] args) {
    //
    DC5 dc5 = new PowerAdapter(new AC220());
    dc5.outputDC5V();
  }
}
