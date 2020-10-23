package com.cg;

import org.junit.Test;

import com.cg.InvoiceGenerator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;

public class InvoiceServiceTest {
InvoiceGenerator invoiceGenerator;
	
	@Before
	public void setUp() {
		 invoiceGenerator = new InvoiceGenerator();
	}
	
	@Test
	public void givenDistanceTimeReturnFare() {
		double distance = 2.0;
		int time = 5;
		double fare = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(25, fare, 0.0);
	}
}
