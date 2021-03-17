package com.stackroute.mar17demos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MainApp4 {
	
	public static void main(String[] args) {

		String input="Welcome to javascript , VBscript and Jscript courses, knowing scripting is good";
	
		// ? - 0 or 1, * - 0 or more, + - 1 or more 
		Pattern newPattern = Pattern.compile("[A-Za-z]+script");
		
		Matcher newMatch = newPattern.matcher(input);
		
		while(newMatch.find()) {
			System.out.println(newMatch.group());
			
		}
		
	}


}
