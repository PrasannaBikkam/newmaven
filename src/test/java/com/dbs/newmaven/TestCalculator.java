package com.dbs.newmaven;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dbs.newmaven.Calculator;

public class TestCalculator {

	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		int res = cal.add(11,22);
		assertEquals(33,res);
		}
	
	@Test
	public void testSub() {
		Calculator cal = new Calculator();
		int res = cal.sub(11,2);
		assertEquals(9,res);
		}

}
