package com.bnp.kata.developemetbooks.services;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bnp.kata.developemetbooks.model.ShoppingCartItem;

@ExtendWith(MockitoExtension.class)
public class BookPurchaseServicesTest {
	BookPurchaseService bookPurchaseService;
	ShoppingCartItem shoppingCartItem;

	private void setShoppingCart(int bookId, int quantity) {
		shoppingCartItem = new ShoppingCartItem();
		shoppingCartItem.setBookId(bookId);
		shoppingCartItem.setQuantity(quantity);
	}

	@Test
	public void calculatePriceShouldReturn50WhenUserBuysOneBook() {
		bookPurchaseService = new BookPurchaseService();
		setShoppingCart(1, 1);

		Assertions.assertEquals(50d, bookPurchaseService.calculateBooksPrice(shoppingCartItem));

	}

	@Test
	public void calculatePriceShouldReturn100WhenUserBuysTwoBook() {
		bookPurchaseService = new BookPurchaseService();
		setShoppingCart(1, 2);

		Assertions.assertEquals(100d, bookPurchaseService.calculateBooksPrice(shoppingCartItem));

	}

}
