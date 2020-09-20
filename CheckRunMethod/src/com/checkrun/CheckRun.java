package com.checkrun;
class MyThread1 extends Thread
{
	
}
class MyThread2 extends Thread implements Runnable
{
	
}
class MyThread3 extends Thread
{
public void run()
{
System.out.println("run no-param");
}
public void  run(String s)
{
System.out.println("run String-param");	
}
}
public class CheckRun {

public static void main(String[] args) {
MyThread3 mt=new MyThread3();
mt.start();
	}

}
