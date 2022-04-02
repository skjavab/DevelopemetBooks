package com.bnp.kata.developemetbooks.services;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.bnp.kata.developemetbooks.config.BookConfig;
import com.bnp.kata.developemetbooks.services.GetBooksDetails;

public class GetBooksDetailsTest {

	GetBooksDetails getBooksDetails = null;

	@Before
	public void setUp() {

		BookConfig bookConfig = new BookConfig();
		Map<Integer, Map<String, String>> getBooksDetailsList = new HashMap<>();
		Map<String, String> book1Info = new HashMap<String, String>();
		book1Info.put("bookName", "Clean Code");
		book1Info.put("author", "Kent Beck");
		book1Info.put("year", "2021");
		getBooksDetailsList.put(1, book1Info);
		bookConfig.setBooks(getBooksDetailsList);
		getBooksDetails = new GetBooksDetails(bookConfig);
	}

	@Test
	public void getBooksDetails() {
		Map<Integer, Map<String, String>> booksDetails = getBooksDetails.getExistBooks();

		Assertions.assertEquals(1, booksDetails.size());
	}

}
