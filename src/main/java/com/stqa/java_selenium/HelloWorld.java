package com.stqa.java_selenium;

import javax.sound.midi.Soundbank;

public class HelloWorld {
  public static void main(String[] args) {
    hello("man");
    hello("dude");
    Square s = new Square(5);

    System.out.println("Area of square with length "+ s.l + "=" + s.area());

    Rectangles r = new Rectangles(4,6);

    System.out.println("Square triangle a and b = " + r.area() );

    }
  public static void hello(String somebody){
    System.out.println("Hello, " +somebody+ "!");
  }


}
