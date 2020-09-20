package com.factorial;
import java.io.IOException;
import java.util.Scanner;
class Solution{
public static int fact(int n)
{
if(n==0)
return 1;
else
return n*fact(n-1);	
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int n=sc.nextInt();
System.out.println("factorial of given number is: "+fact(n));

}
}

