package com.goldilocks;

public class CommandLineInputPrint {
	
	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("There are not any input in args.");
		}else {
			System.out.println("Inputs present are :   ");
			for(String string:args) {
				System.out.println(string);
			}
		}
	}

}
