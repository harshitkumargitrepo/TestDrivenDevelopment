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

}
