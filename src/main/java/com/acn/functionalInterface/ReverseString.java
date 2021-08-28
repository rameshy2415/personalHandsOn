package com.acn.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseString {

	public static void main(String[] args) {

		String string = "I will come and meet you 123woods 123woods at the 123woods";
		String keyword = "123woods";
		//Arrays.asList(string.split(" ")).contains(keyword);
		String a[] = string.split(" ");
		List<String> li = Arrays.asList(a);
		int count = 0;
		//Count using Advance loop
		for (String s : li) {
			if (s.contains(keyword)) {
				count++;
			}
		}
		System.out.println("Count using Advance For loop: "+count);
		
		//Count using Regex
		String regx = "123woods";
		int n = 0;
		Pattern pattern = Pattern.compile(regx);
		Matcher match = pattern.matcher(string);
		while (match.find()) {
			n++;
		}
		/*if (match.find()) {
			System.out.println("Found");
		}*/
		System.out.println("Count the Character : "+n);
		
		String reg = "\\d";
		Pattern patt= Pattern.compile(reg);
		Matcher m=patt.matcher(string);
		int co=0;
		while(m.find()) {
			co++;
		}
		System.out.println("Count the Digit : "+co);
		
		String st1="[a-z]";
		Pattern p= Pattern.compile(st1);
		Matcher mat=p.matcher(string);

		// =====================================================================================================================
		System.out.println("Enter String to reverse");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char c = 'a';
		int ascii = c;
		System.out.println("Assci value: of a :" + ascii);
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println("Reversed String==> " + rev);
	}
}
