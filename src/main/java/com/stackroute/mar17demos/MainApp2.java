package com.stackroute.mar17demos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MainApp2 {
	
	public static void main(String[] args) {

		String input="Javascript";
		
		Pattern newPattern = Pattern.compile("[A-Za-z]*script");
		
		Matcher newMatch = newPattern.matcher(input);
		
		System.out.println(newMatch.matches());
		
	}


}
