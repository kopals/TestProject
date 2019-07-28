package com.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumDigitsNumber {
	 static int bites = 0;
	 
	    public void takeBite() {
	        bites++;
	    }
	 public static void main(String[] args) {
		List<String> strList = Arrays.asList("kopal","ashwin","joye","amy","markus");
		sort(strList);
		SumDigitsNumber sd = new SumDigitsNumber();
		SumDigitsNumber sd1 = new SumDigitsNumber();
		sd.takeBite();
		sd1.takeBite();
		System.out.println(sd.bites);
		System.out.println(sd1.bites);
		
	}
	 static public void sort(List<String> names)
	 {
		 Collections.sort(names, (s1,s2)-> s1.compareTo(s2));
		 System.out.println(names);
	 }
}
