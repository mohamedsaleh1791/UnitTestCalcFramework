package com.calc;
public class Calc {
 
  public int add(int no1,int no2) {
	  return no1+no2;
  }
  
  public int sub(int no1,int no2) {
	  return no1-no2;
  }
  
  public int mul(int no1,int no2) {
	  return no1*no2;
  }
  
  public double div(double no1,double no2) throws Exception {
	  if(no2==0) {
		  throw  new IllegalArgumentException("can't divid by zero");
	  }
	  return no1/no2;
  }
}
