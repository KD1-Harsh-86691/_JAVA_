// KD1-86691-HARSH

package com.cdac;

public class Pallindrome {

	public static void main(String[] args) {
		
	String str = "nitin";
	
	//empty string temp
	String temp  = "";

	//Inserting char by char in temp string in reverse order
	for(int i = str.length() - 1;i>=0;i--)
	{
		temp = temp + str.charAt(i);
	}
	
	if(str.equals(temp))
		System.out.println("Palindrome.");
	else
	{
		System.out.println("Not Palindrome.");
	}
}}
