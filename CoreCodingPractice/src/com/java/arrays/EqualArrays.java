package com.java.arrays;

import java.util.Arrays;

public class EqualArrays {
	public static void main(String[] args) {
		String[] s1 = {"Ashwin", "Kopal", "Ron", "green"};
		String[] s2 = {"Ron", "green", "Kopal", "Ashwin"};
		Arrays.sort(s1);
		Arrays.sort(s2);
		System.out.println(Arrays.equals(s1, s2));
		
 	}
}
