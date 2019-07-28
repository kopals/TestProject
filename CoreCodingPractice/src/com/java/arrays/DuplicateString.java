package com.java.arrays;

import java.util.HashMap;
import java.util.Set;

public class DuplicateString {
	public static void main(String[] args) {
//		String s = "  rer add ddsad   $";
//		s = s.replaceAll("\\s", "");
//		System.out.println(s);
		duplicateCharCount("Kopal");
		duplicateCharCount("Test Test");
		duplicateCharCount("Test Rest");
	}
	static void duplicateCharCount(String s)
	{
		HashMap<Character,Integer> charMap = new HashMap<Character, Integer>();
		char[] chrStr = s.toCharArray();
		for(char c : chrStr)
		{
			if(charMap.containsKey(c))
			{
				charMap.put(c,charMap.get(c)+1);
			}
			else {
				charMap.put(c, 1);
			}
			
		}
		Set<Character> charSet = charMap.keySet();
		System.out.println("Duplicate Chars in "+s);
		for(Character cs:charSet)
		{
			if(charMap.get(cs)>1)
			{
				System.out.println(cs+ ":"+ charMap.get(cs));
			}
		}
	}
}
