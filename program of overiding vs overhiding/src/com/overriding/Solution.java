package com.overriding;
class A {} 
class B extends A {} 
class Base 
{ 
A fun() 
{ 
System.out.println("Base fun()"); 
return new A(); 
} 
} 
class Derived extends Base 
{ 
B fun() 
{ 
System.out.println("Derived fun()"); 
return new B(); 
} 
} 
public class Solution {
public static void main(String[] args) {
Base base = new Derived(); 
base.fun(); 
}
}
