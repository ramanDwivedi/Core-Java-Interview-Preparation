package com.syscronization;
public class Add {
int x,y;
synchronized void add(int x, int y)
{
this.x=x;
this.y=y;
try
{
Thread.sleep(100);
}
catch(Exception e)
{
e.printStackTrace();
}
int res=this.x+this.y;
System.out.println("In"+Thread.currentThread().getName()+"Result:"+res);

}
}
