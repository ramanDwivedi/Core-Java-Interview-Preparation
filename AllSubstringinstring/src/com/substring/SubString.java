package com.substring;

import java.util.Scanner;

public class SubString {
public static void subString(String str)
{
int n=str.length();
for(int i=0;i<n;i++)
{
for(int j=i+1;j<=n;j++)
{
System.out.println(str.substring(i,j));	
}
}
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str=sc.next();
subString(str);
	}

}
