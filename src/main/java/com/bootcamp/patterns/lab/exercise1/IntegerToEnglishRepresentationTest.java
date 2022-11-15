package com.bootcamp.patterns.lab.exercise1;

public class IntegerToEnglishRepresentationTest {

	public static void main(String[] args) {

		NumberWordsMap map = NumberWordsMap.instance();
		map.fillMap();

		Number translate = new Number.Translator().initiate(1234, map.getNumberWords()).process().translate();
		System.out.println(String.format("Input: num = %s", translate.getNum()));
		System.out.println(String.format("Output: %s", translate.getTranslatedNumber()));
	}

}
