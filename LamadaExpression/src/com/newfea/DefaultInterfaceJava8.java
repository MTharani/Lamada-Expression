package com.newfea;
interface Calculation
{
	void add(int a,int b);
	default void mul(int a, int b)
	{
		int mul=a*b;
		System.out.println("Calculation product: "+mul);
	}
	static void sub(int a, int b)
	{
		int ans=a-b;
		System.out.println("Different: "+ans);
	}
}
interface MyCalculation
{
	default void mul(int a, int b)
	{
		int mul=a*b;
		System.out.println("MyCalculation product: "+mul);
	}
}

public class DefaultInterfaceJava8 implements Calculation, MyCalculation
{ 
	@Override
	public void add(int a, int b) 
	{
		int sum=a+b;
		System.out.println("sum: "+sum);
		
	}


	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		Calculation.super.mul(a, b);
		MyCalculation.super.mul(10, 5);
	}


	public static void main(String[] args) 
	{
		DefaultInterfaceJava8  di=new DefaultInterfaceJava8();
		di.add(5, 5);
		di.mul(5, 2);
		Calculation.sub(5, 3);

	}

	
}
