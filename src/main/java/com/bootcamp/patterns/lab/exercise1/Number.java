package com.bootcamp.patterns.lab.exercise1;

import java.util.HashMap;

public class Number {

	private int num;
	private String translatedNumber;

	public Number(int num, String translatedNumber) {
		this.num = num;
		this.translatedNumber = translatedNumber;
	}

	public int getNum() {
		return num;
	}

	public String getTranslatedNumber() {
		return translatedNumber;
	}

	public static class Translator {
		
		private final int million = 1_000_000;
		private final int thousand = 1_000;
		private int integer;
		private String translatedNumber;
		HashMap<Integer, String> map;

		public Translator initiate(int num, HashMap<Integer, String> map) {
			this.integer = num;
			this.map = map;
			return this;
		}
		
		public Translator process() {
	     
	        StringBuilder sb = new StringBuilder();
	        int num = integer;
	 
	       
	        if(num >= million){
	            int extra = num/million;
	            sb.append(convert(extra) + " Million");
	            num = num%million;
	        } 
	 
	        if(num >= thousand){
	            int extra = num/thousand;
	            sb.append(convert(extra) + " Thousand");
	            num = num%thousand;
	        } 
	 
	        if(num > 0){
	            sb.append(convert(num));
	        }
	 
	        translatedNumber = sb.toString().trim();
	        return this;
	    }
	 
	    private String convert(int num){
	 
	        StringBuilder sb = new StringBuilder();
	 
	        if(num>=100){
	            int numHundred = num/100;
	            sb.append(" " +map.get(numHundred)+ " Hundred");
	            num=num%100;
	        }
	 
	        if(num > 0){
	            if(num>0 && num<=20){
	                sb.append(" "+map.get(num));
	            }else{
	                int numTen = num/10;
	                sb.append(" "+map.get(numTen*10));
	 
	                int numOne=num%10;
	                if(numOne>0){
	                    sb.append(" " + map.get(numOne));
	                }
	            }
	        }
	 
	        return sb.toString();
	    }
	 

		public Number translate() {
			Number number = new Number(integer, translatedNumber);
			return number;
		}
	}

}
