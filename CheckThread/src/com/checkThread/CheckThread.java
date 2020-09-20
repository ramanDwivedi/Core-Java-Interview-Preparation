package com.checkThread;
class MyRunnable implements Runnable
{
public void run()
{
System.out.println("From my Runnable.run()");	
}
}
class MyThread extends Thread
{
public MyThread() {
super();
}
MyThread(Runnable target)
{
super(target);	
}
public void run()
{
System.out.println("From MyThread.run()");	
}
}

public class CheckThread {

public static void main(String[] args) {
Thread th1=new Thread();
th1.start();//No Output
MyThread mt=new MyThread();
mt.start();//output:From MyThread.run()
MyRunnable mr=new MyRunnable();
//mr.start();CE the method start not available in Runnable interface
MyRunnable mr1=new MyRunnable();
Thread th2=new Thread(mr1);
th2.start();//output:From my Runnable.run();
MyThread mt1=new MyThread();
Thread th3=new Thread(mt1);
th3.start();//output:From my Runnable.run()
Thread th4=new Thread();
th4.start();//No Output
//Thread th5=new MyRunnable();//cannot convert from MyRunnable to Thread
//Runnable r=new MyRunnable();
//r.start();//CE state is unchange for type runnable
Runnable r=new MyRunnable();
Thread th6=new Thread(r);
th6.start();// From my Runnable.run()
Runnable r1=new MyThread();
//r1.start();//CE
Thread th7=new Thread(r1);
//th7.start();//CE
MyRunnable mr2=new MyRunnable();
MyThread mt2=new MyThread(mr2);
mt2.start();//From MyThread.run()

}

}
