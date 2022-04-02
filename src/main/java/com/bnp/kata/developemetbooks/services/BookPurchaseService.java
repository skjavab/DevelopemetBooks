package com.bnp.kata.developemetbooks.services;

import org.springframework.stereotype.Service;

import com.bnp.kata.developemetbooks.model.ShoppingCartItem;

@Service
public class BookPurchaseService {
	public Double calculateBooksPrice(ShoppingCartItem shoppingCartItem) {
		return 50d * shoppingCartItem.getQuantity();

	}

}
