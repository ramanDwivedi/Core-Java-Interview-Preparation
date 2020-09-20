package com.pronic;

import java.util.Scanner;

public class PronicNumber {
public static boolean pronic(int num)
{
boolean flag=false;
for(int i=1;i<=num;i++)
if(i*(i+1)==num)
{
flag=true;
break;
}
return flag;

}
public static void main(String[] args) {
System.out.println("Pronic number between 1 to 100");	
for(int i=1;i<=100;i++)
{	
boolean result=pronic(i);
if(result)
System.out.print(i+" ");
}
}
}
