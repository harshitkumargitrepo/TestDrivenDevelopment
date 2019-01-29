package com.tdd.acmisbnvalidator;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidateISBNTest {
	@Test
	public void checkAValidISBN() {
		ValidatorISBN validator = new ValidatorISBN();	
		boolean isValidISBN = validator.checkISBN(201847051);
		assertTrue(isValidISBN);
	}
	@Test
	public void checkAnInValidISBN() {
		ValidatorISBN validator = new ValidatorISBN();	
		boolean isValidISBN = validator.checkISBN(201847057);
		//fail();
		assertFalse(isValidISBN);
	}
}

