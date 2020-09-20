package com.inter;
class Test 
{ 
interface Yes 
{ 
void show(); 
} 
} 
class Testing implements Test.Yes 
{ 
public void show() 
{ 
System.out.println("show method of interface"); 
} 
} 
public class A {
public static void main(String[] args) {
Testing t = new Testing(); 
t.show(); 
}
}
