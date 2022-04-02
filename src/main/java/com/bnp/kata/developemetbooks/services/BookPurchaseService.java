package com.bnp.kata.developemetbooks.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bnp.kata.developemetbooks.model.ShoppingCartItem;

@Service
public class BookPurchaseService {
	public Double calculateBooksPrice(List<ShoppingCartItem> bookList) {
		double calculatedPrice = 0d;
		double price = 50d;
		if (bookList.size() == 1) {
			ShoppingCartItem shoppingCartItembook = bookList.get(0);
			return price * shoppingCartItembook.getQuantity();
		} else if (bookList.size() == 2) {
			double basePrice = bookList.size() * price;
			double discountedPriceForSet = basePrice - ((basePrice * 5) / 100.0);
			calculatedPrice += discountedPriceForSet;
		} else if (bookList.size() == 3) {
			double basePrice = bookList.size() * price;
			double discountedPriceForSet = basePrice - ((basePrice * 10) / 100.0);
			calculatedPrice += discountedPriceForSet;
		}
		return calculatedPrice;

	}
}