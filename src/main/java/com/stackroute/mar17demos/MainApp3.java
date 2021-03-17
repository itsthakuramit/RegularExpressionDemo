package com.stackroute.mar17demos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MainApp3 {
	
	public static void main(String[] args) {

		String input="Welcome to Javascript and VBscript courses";
		
		Pattern newPattern = Pattern.compile("[A-Za-z]*script");
		
		Matcher newMatch = newPattern.matcher(input);
		
		while(newMatch.find()) {
			// To print the matching pattern
			System.out.println(newMatch.group());
			// start index of the matching word
			System.out.println(newMatch.start());
			// end index of the matching word
			System.out.println(newMatch.end());
			
		}
		
	}


}
