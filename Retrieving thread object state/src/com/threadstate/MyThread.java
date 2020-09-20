package com.threadstate;
public class MyThread extends Thread {
public void run()
{
System.out.println("run start");	
try
{
System.out.println("Before pause-1");
Thread.sleep(5000);
}
catch(InterruptedException ie)
{
System.out.println("IE raised");	
}
System.out.println("after pause-1");
try
{
System.out.println("before pause-2");
Thread.sleep(10000);
}
catch(InterruptedException ie)
{
System.out.println("IE raised");	
}
System.out.println("after pause-2");
System.out.println("run end");
}

}
