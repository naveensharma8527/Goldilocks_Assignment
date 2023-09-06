package com.goldilocks;

import java.util.Scanner;

public class DecimalToBinary {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Decimal Number");
		
		String decimalNumber = sc.next();
		
		String binaryNumber = decimalToBinary(decimalNumber);
//		1111011
		System.out.println(binaryNumber );
		
		
	}
	
	public static String decimalToBinary(String str) {
		
		int num = Integer.parseInt(str);
		
		StringBuilder binary = new StringBuilder();
		
			while(num>0) {
				
				int rem = num%2;
				binary.append(rem);
				num/=2;	
			}
			
			return binary.reverse().toString();
		
	}
	

}
