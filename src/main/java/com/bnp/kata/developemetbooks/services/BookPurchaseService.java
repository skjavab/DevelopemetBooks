package com.bnp.kata.developemetbooks.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bnp.kata.developemetbooks.constant.DevelopemetBooksConstant;
import com.bnp.kata.developemetbooks.model.ShoppingCartItem;

@Service
public class BookPurchaseService {
	public Double calculateBooksPrice(List<ShoppingCartItem> bookList) {
		double calculatedPrice = 0d;
		if (bookList.size() == 1) {
			ShoppingCartItem shoppingCartItembook = bookList.get(0);
			calculatedPrice = DevelopemetBooksConstant.PRICE * shoppingCartItembook.getQuantity();
		} else if (bookList.size() == 2) {
			double basePrice = bookList.size() * DevelopemetBooksConstant.PRICE;
			double discountedPriceForSet = basePrice - ((basePrice * 5) / DevelopemetBooksConstant.PERCENTAGE);
			calculatedPrice += discountedPriceForSet;
		} else if (bookList.size() == 3) {
			double basePrice = bookList.size() * DevelopemetBooksConstant.PRICE;
			double discountedPriceForSet = basePrice - ((basePrice * 10) / DevelopemetBooksConstant.PERCENTAGE);
			calculatedPrice += discountedPriceForSet;
		} else if (bookList.size() == 4) {
			double basePrice = bookList.size() * DevelopemetBooksConstant.PRICE;
			double discountedPriceForSet = basePrice - ((basePrice * 20) / DevelopemetBooksConstant.PERCENTAGE);
			calculatedPrice += discountedPriceForSet;
		} else if (bookList.size() == 5) {
			double basePrice = bookList.size() * DevelopemetBooksConstant.PRICE;
			double discountedPriceForSet = basePrice - ((basePrice * 25) / DevelopemetBooksConstant.PERCENTAGE);
			calculatedPrice += discountedPriceForSet;
		}
		return calculatedPrice;

	}

	public List<Integer> getBookIdList(List<ShoppingCartItem> bookInputList) {
		List<Integer> totalNumberOfbooks = new ArrayList<>();
		for (ShoppingCartItem bookApiRequest : bookInputList) {
			addBookId(totalNumberOfbooks, bookApiRequest);
		}
		return totalNumberOfbooks;
	}

	private List<Integer> addBookId(List<Integer> extractedList, ShoppingCartItem bookApiRequest) {

		for (int i = 0; i < bookApiRequest.getQuantity(); i++) {
			extractedList.add(bookApiRequest.getBookId());
		}

		return extractedList;
	}
}