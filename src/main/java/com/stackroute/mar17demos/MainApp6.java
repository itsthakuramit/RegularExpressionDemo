package com.stackroute.mar17demos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MainApp6 {
	
	public static void main(String[] args) {

		String input="22-12-2021 is the last date"
				+ "if you miss you can complete by 2021-12-12";
	
		// ? - 0 or 1, * - 0 or more, + - 1 or more 
		Pattern newPattern = Pattern.compile("[0-9]{1,2}-[0-9]{1,2}-[0-9]{4}");
		
		Matcher newMatch = newPattern.matcher(input);
		
		while(newMatch.find()) {
			System.out.println(newMatch.group());
			
		}
		
	}


}
