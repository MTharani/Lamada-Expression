package com.newfea;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args)
	{
		Function<String, Integer> len=(str)->str.length();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String s=sc.nextLine();
        int l=len.apply(s);
        System.out.println("Length of the string: "+l);
	}

}
