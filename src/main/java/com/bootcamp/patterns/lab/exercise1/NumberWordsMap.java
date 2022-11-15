package com.bootcamp.patterns.lab.exercise1;

import java.util.HashMap;

public class NumberWordsMap {

	private HashMap<Integer, String> numberWords;

	private static NumberWordsMap INSTANCE;

	public static NumberWordsMap instance() {
		if (INSTANCE == null) {
			INSTANCE = new NumberWordsMap();
		}
		return INSTANCE;
	}

	private NumberWordsMap() {
	}

	public void fillMap() {

		numberWords = new HashMap<Integer, String>();
		numberWords.put(0, "Zero");
		numberWords.put(1, "One");
		numberWords.put(2, "Two");
		numberWords.put(3, "Three");
		numberWords.put(4, "Four");
		numberWords.put(5, "Five");
		numberWords.put(6, "Six");
		numberWords.put(7, "Seven");
		numberWords.put(8, "Eight");
		numberWords.put(9, "Nine");
		numberWords.put(10, "Ten");
		numberWords.put(11, "Eleven");
		numberWords.put(12, "Twelve");
		numberWords.put(13, "Thirteen");
		numberWords.put(14, "Fourteen");
		numberWords.put(15, "Fifteen");
		numberWords.put(16, "Sixteen");
		numberWords.put(17, "Seventeen");
		numberWords.put(18, "Eighteen");
		numberWords.put(19, "Nineteen");
		numberWords.put(20, "Twenty");
		numberWords.put(30, "Thirty");
		numberWords.put(40, "Forty");
		numberWords.put(50, "Fifty");
		numberWords.put(60, "Sixty");
		numberWords.put(70, "Seventy");
		numberWords.put(80, "Eighty");
		numberWords.put(90, "Ninety");
	}

	public HashMap<Integer, String> getNumberWords() {
		return numberWords;
	}
}
