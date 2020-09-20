package com.thread;
public class Slution extends Thread{
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println(i);	
}
}
public static void main(String[] args) {
Slution t1=new Slution();
Slution t2=new Slution();
t1.start();
t2.start();
}  
}

