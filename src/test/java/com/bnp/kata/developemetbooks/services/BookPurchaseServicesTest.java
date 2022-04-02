package com.bnp.kata.developemetbooks.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookPurchaseServicesTest {

	@Test
	public void calculatePriceShouldReturn50WhenUserBuysOneBook() {
		BookPurchaseService bookPurchaseService = new BookPurchaseService();
		Assertions.assertEquals(50d, bookPurchaseService.calculateBooksPrice("1"));

	}

}
