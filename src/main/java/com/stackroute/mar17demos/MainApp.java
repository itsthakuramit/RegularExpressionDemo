package com.stackroute.mar17demos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MainApp {
	
	public static void main(String[] args) {

		String input="Welcome to Java and Javascript";
	
		Pattern newPattern = Pattern.compile("Java");
		
		Matcher newMatch = newPattern.matcher(input);
		
			//input = newMatch.replaceFirst("Javascript");
			input = newMatch.replaceAll("Javascript");
		
			System.out.println(input);
		
	}


}
