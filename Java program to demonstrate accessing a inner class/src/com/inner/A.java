package com.inner;
class OuterClass 
{  
// static member 
static int outer_x = 10; 
// instance(non-static) member 
int outer_y = 20; 
// private member 
private int outer_private = 30; 
// inner class 
class InnerClass 
{ 
void display() 
{ 
// can access static member of outer class 
System.out.println("outer_x = " + outer_x); 
// can also access non-static member of outer class 
System.out.println("outer_y = " + outer_y);
// can also access private member of outer class 
System.out.println("outer_private = " + outer_private); 
          
        } 
    } 
} 
public class A {
public static void main(String[] args) {
OuterClass outerObject = new OuterClass(); 
OuterClass.InnerClass innerObject = outerObject.new InnerClass(); 
innerObject.display(); 
}
}
