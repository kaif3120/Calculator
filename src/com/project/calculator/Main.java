package com.project.calculator;

public class Main {
  public static void main(String[] args) {
	  
	  int a= 9;
	  int b = 3;
	  
	  Calculator cal = new Calculator();
	  
	  System.out.println(cal.sum(a,b));
	  System.out.println(cal.subtract(a,b));
	  System.out.println(cal.multiply(a,b));
	  System.out.println(cal.divide(a,b));
	  System.out.println(cal.percentage(b,a));
	  System.out.println(cal.sqRoot(a));
  }
}
