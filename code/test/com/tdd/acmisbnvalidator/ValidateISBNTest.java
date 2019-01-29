package com.tdd.acmisbnvalidator;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidateISBNTest {
	@Test
	public void checkAValidISBN() {
		ValidatorISBN validator = new ValidatorISBN();	
		boolean isValidISBN = validator.checkISBN(201847051);
		assertTrue("First Publication",isValidISBN);
		isValidISBN = validator.checkISBN(387858199);
		assertTrue("Second Publication",isValidISBN);
	}
	@Test
	public void checkAnInValidISBN() {
		ValidatorISBN validator = new ValidatorISBN();	
		boolean isValidISBN = validator.checkISBN(201847057);
		//fail();
		assertFalse(isValidISBN);
	}
}

