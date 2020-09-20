package com.innner;
class A{  
interface Message{  
void msg();  
}  
}  
public class Soution implements A.Message{  
public void msg(){System.out.println("Hello nested interface");}  
public static void main(String []args)
{
A.Message sl=new Soution();
sl.msg();


}
}
