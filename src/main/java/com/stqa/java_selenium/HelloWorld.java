package com.stqa.java_selenium;

import javax.sound.midi.Soundbank;

public class HelloWorld {
  public static void main(String[] args) {
    hello("man");
    hello("dude");
    double len = 5;
    System.out.println("Area of square with length "+ len + "=" + area(len));

    double a = 4;
    double b = 6;
    System.out.println("Square triangle a and b = " + area(a,b) );

    }

  public static void hello(String somebody){

    System.out.println("Hello, " +somebody+ "!");
  }

  public static double area(double l){
    return l*l;
  }
  public static double area(double a, double b){
    return a * b;
  }
}
