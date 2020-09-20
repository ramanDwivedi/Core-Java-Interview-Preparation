package com.threadstate;
public class Test123_GetThreadState {
public static void main(String[] args)throws InterruptedException {
System.out.println("main start");
MyThread mt=new MyThread();
//mt.interrupt();
mt.start();
//mt.interrupt();
mt.interrupt();
Thread.sleep(2000);
mt.interrupt();
System.out.println("main end");
}
}
