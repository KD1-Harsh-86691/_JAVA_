package com.cdac.p1.tester;

import java.util.Scanner;

import com.cdac.p1.exception.ExceptionLineTooLong;
import com.cdac.p1.program.Program01;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string ");
		String str = sc.next();
		
		try {
			Program01 p = new Program01(str);
		} catch (ExceptionLineTooLong e) {
			e.printStackTrace();
		}
		

	}

}

