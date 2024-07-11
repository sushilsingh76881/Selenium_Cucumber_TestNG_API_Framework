package com.qa.JavaProgramming;

import org.testng.annotations.Test;

public class Replace {

	public String String1 = "East or west India is the best";
	public String String2 = "India 545!#&)(*^#$^%&$#@^^%3";

	@Test
	public void ReplaceSomeTextInString() {
		String text = String1.replace("onesi", "");
		System.out.println(text);
	}
	
	@Test
	public void RemoveAllSpecialCharsFromString() {
		String text = String2.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(text);
	}
}