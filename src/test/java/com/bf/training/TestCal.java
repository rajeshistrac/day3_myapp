package com.bf.training;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class TestCal {

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		int result = calc.add(5, 5);
		assertEquals(10, result);
	}

	@Test
	public void testMul(){
		Calculator calc = new Calculator();
		int result = calc.mul(5, 5);
		assertEquals(25, result);
	}
}
