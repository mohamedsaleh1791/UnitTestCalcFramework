package com.calc.test;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import com.calc.Calc;

public class TestCalac {
	Calc calc=new Calc();
//	Test add function
	@Test
	public void test_add(){
//		positive test cases
		assertEquals(calc.add(5, 6), 11);
		assertEquals(calc.add(5, -6), -1);
		assertEquals(calc.add(-5, -6), -11);
		
	}
//	Test sub function
	@Test
	public void test_sub(){
//		positive test cases
		assertEquals(calc.sub(6, 5), 1);
		assertEquals(calc.sub(6, -5), 11);
		assertEquals(calc.sub(-6, -5), -1);
		
	}
//	Test multiply function
	@Test
	public void test_mul(){
//		positive test cases
		assertEquals(calc.mul(6, 5), 30);
		assertEquals(calc.mul(6, -5), -30);
		assertEquals(calc.mul(-6, -5), 30);
		
	}
//	Test division function
	@Test(expectedExceptions=IllegalArgumentException.class)
	public void test_div() throws Exception {
//		positive test cases
		assertEquals(calc.div(6, 2), 3);
		assertEquals(calc.div(6, -6), -1);
		assertEquals(calc.div(-6, -6), 1);
		calc.div(10, 0);
		
	}
	

}
