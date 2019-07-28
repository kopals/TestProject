package com.java.arrays;

public class ReverseString {
	
	public static void main(String[] args)
	{
		String s = "Ashwin Rao";
		char[] chr= s.toCharArray();
		for(int i=chr.length-1; i>=0;i--)
		{
			System.out.print(chr[i]);
		}
		System.out.println();
		String st = recursiveMethod("Kopal Shinde");
		System.out.println(st);
	}
	static String recursiveMethod(String s)
	{
		if(s==null|| s.length()<=0)
		{
			return s;
		}
		return recursiveMethod(s.substring(1))+ s.charAt(0);
	}
	
	
}
