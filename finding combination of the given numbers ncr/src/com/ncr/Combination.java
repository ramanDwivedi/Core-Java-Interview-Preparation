package com.ncr;

import java.util.Scanner;

public class Combination {
public static int NcR(int n,int r)
{
return fact(n)/(fact(n-r)*fact(r));	
}
public static int fact(int n)
{
int res=1;
for(int i=2;i<=n;i++)
res *=i;
return res;
}

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n and r");
int n=sc.nextInt();
int r=sc.nextInt();
System.out.println("NcR "+NcR(n, r));


	}

}
