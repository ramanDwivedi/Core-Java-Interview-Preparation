package com.syncronization;
public class Syncroniztion {
public static void main(String[] args) {
MyThread1 t1=new MyThread1();  
MyThread2 t2=new MyThread2();  
Mythread3 t3=new Mythread3();  
MyThread4 t4=new MyThread4();  
t1.start();  
t2.start();  
t3.start();  
t4.start();  
}
}
