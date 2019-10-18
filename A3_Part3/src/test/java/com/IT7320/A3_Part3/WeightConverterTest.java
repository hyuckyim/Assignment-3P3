package com.IT7320.A3_Part3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WeightConverterTest {

	WeightConverter wc;
	
	@Before
	public void setUp() throws Exception {
		wc = new WeightConverter();
	}

	@After
	public void tearDown() throws Exception {
		wc = null;
	}

	@Test
	public void testKGToPound() {
		// multiply by 2.205
		assertEquals(2.205, wc.fromKGToPound(1), 0.001);
	}
	
	@Test
	public void testKGToStone() {
		// divide by 6.35
		assertEquals(1, wc.fromKGToStone(6.35), 0.001);
	}
	
	@Test
	public void testPoundToStone() {
		// divide by 14
		assertEquals(1, wc.fromPoundToStone(14), 0.001);
	}
	
	@Test
	public void testPoundToKG() {
		// divide by 2.205
		assertEquals(1, wc.fromPoundToKG(2.205), 0.001);
	}
	
	@Test
	public void testStoneToKG() {
		// multiply by 6.35
		assertEquals(6.35, wc.fromStoneToKG(1), 0.001);
	}
	
	@Test
	public void testStoneToPound() {
		// multiply by 14
		assertEquals(14, wc.fromStoneToPound(1), 0.001);
	}

}