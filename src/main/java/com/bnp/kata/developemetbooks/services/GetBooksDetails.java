package com.bnp.kata.developemetbooks.services;

import java.util.Map;

import com.bnp.kata.developemetbooks.config.BookConfig;

public class GetBooksDetails {
	
	public GetBooksDetails(BookConfig bookConfig)
	{
		this.bookConfig=bookConfig;
	}

	BookConfig bookConfig;
	
	public Map<Integer, Map<String, String>> getExistBooks() {
		return bookConfig.getBooks();

	}

}
