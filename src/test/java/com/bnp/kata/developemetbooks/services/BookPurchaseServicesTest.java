package com.bnp.kata.developemetbooks.services;

import java.util.ArrayList;
import java.util.List;

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
		List<ShoppingCartItem> bookList = new ArrayList<>();
		setShoppingCart(1, 1);
		bookList.add(shoppingCartItem);

		Assertions.assertEquals(50d, bookPurchaseService.calculateBooksPrice(bookList));

	}

	@Test
	public void calculatePriceShouldReturn100WhenUserBuysTwoBook() {
		bookPurchaseService = new BookPurchaseService();
		List<ShoppingCartItem> bookList = new ArrayList<>();
		setShoppingCart(1, 2);
		bookList.add(shoppingCartItem);

		Assertions.assertEquals(100d, bookPurchaseService.calculateBooksPrice(bookList));

	}

	@Test
	public void calculatePriceShouldReturn95WhenUserBuysTwoDifferentBook() {
		bookPurchaseService = new BookPurchaseService();
		List<ShoppingCartItem> bookList = new ArrayList<>();
		setShoppingCart(1, 1);
		bookList.add(shoppingCartItem);
		setShoppingCart(2, 1);
		bookList.add(shoppingCartItem);

		Assertions.assertEquals(95d, bookPurchaseService.calculateBooksPrice(bookList));

	}

	@Test
	public void calculatePriceShouldReturn135WhenUserBuysThreeDifferentBook() {
		bookPurchaseService = new BookPurchaseService();
		List<ShoppingCartItem> bookList = new ArrayList<>();
		setShoppingCart(1, 1);
		bookList.add(shoppingCartItem);
		setShoppingCart(2, 1);
		bookList.add(shoppingCartItem);
		setShoppingCart(3, 1);
		bookList.add(shoppingCartItem);

		Assertions.assertEquals(135d, bookPurchaseService.calculateBooksPrice(bookList));

	}

	@Test
	public void calculatePriceShouldReturn160WhenUserBuysFoursDifferentBook() {
		bookPurchaseService = new BookPurchaseService();
		List<ShoppingCartItem> bookList = new ArrayList<>();
		setShoppingCart(1, 1);
		bookList.add(shoppingCartItem);
		setShoppingCart(2, 1);
		bookList.add(shoppingCartItem);
		setShoppingCart(3, 1);
		bookList.add(shoppingCartItem);
		setShoppingCart(4, 1);
		bookList.add(shoppingCartItem);

		Assertions.assertEquals(160d, bookPurchaseService.calculateBooksPrice(bookList));

	}

	@Test
	public void calculatePriceShouldReturn187WhenUserBuysFiveDifferentBook() {
		bookPurchaseService = new BookPurchaseService();
		List<ShoppingCartItem> bookList = new ArrayList<>();
		setShoppingCart(1, 1);
		bookList.add(shoppingCartItem);
		setShoppingCart(2, 1);
		bookList.add(shoppingCartItem);
		setShoppingCart(3, 1);
		bookList.add(shoppingCartItem);
		setShoppingCart(4, 1);
		bookList.add(shoppingCartItem);
		setShoppingCart(5, 1);
		bookList.add(shoppingCartItem);

		Assertions.assertEquals(187.5d, bookPurchaseService.calculateBooksPrice(bookList));

	}

}
