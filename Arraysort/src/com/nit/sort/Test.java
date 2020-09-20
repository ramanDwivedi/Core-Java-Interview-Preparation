package com.nit.sort;
import java.util.Scanner;
public class Test {
public static void wissenSort(int arr[])
{
if(arr==null || arr.length<=1)
return;
for(int i=1;i<arr.length;i++)
{
if(i % 2==1)
{
if(arr[i-1]>arr[i])
swap(arr,i-1,i);	
}
else
{
if(arr[i-1]<arr[i])	
swap(arr,i-1,i);
}
}
}
public static void swap(int []arr,int i, int j)
{
int t=arr[i];
arr[i]=arr[j];
arr[j]=t;
}
public static void printArray(int []arr)
{
for(int i=0;i<arr.length;i++)
System.out.print(arr[i]+" ");	
}

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size");
int n=sc.nextInt();
int []arr=new int[n];
for(int i=0;i<arr.length;i++)
arr[i]=sc.nextInt();
wissenSort(arr);
printArray(arr);
	}

}
