package com.largestcommonprefix;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Size of Array:");
int n=sc.nextInt();
int arr1[]=new int[n];
int arr2[]=new int[n];
System.out.println(" Enter the elements of arr1:");
for(int i=0;i<n;i++)
arr1[i]=sc.nextInt();
System.out.println(" Enter the elements of arr2:");
for(int i=0;i<n;i++)
arr2[i]=sc.nextInt();
System.out.print(" Common Elements of both the Arrays:");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(arr1[i]==arr2[j])
{
System.out.print(arr1[i]+" ");break;	
}
}
}
}
}
