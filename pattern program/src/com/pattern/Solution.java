package com.pattern;
import java.util.Scanner;
public class Solution {
public static void main(String[] args) {
int n1=1;	
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n");
int n=sc.nextInt();
System.out.println();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(j+" ");	
}
System.out.println();
}
}
}
