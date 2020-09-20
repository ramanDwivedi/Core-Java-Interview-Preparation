package pack;
class A
{
A()
{
System.out.println("A-Constructor");	
}
}
class B extends A
{
B()
{
System.out.println("B-constructor");	
}
}
public class Test {
public static void main(String[] args) {
A a=new B();
}
}

