package com.syscronization;
public class Test {
public static void main(String[] args) 
{
Add add=new Add();
new Thread1(add).start();
new Thread2(add).start();

	}

}
