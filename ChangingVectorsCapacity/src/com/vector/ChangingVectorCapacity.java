package com.vector;

import java.util.Vector;

import com.address.Adress;
import com.customer.Customer;

public class ChangingVectorCapacity {
public static void main(String[] args) {
Vector v=new Vector(3);
System.out.println("Initial Capacity and Size of vector is..");
System.out.println("Capacity:"+v.capacity());
System.out.println("Size :"+v.size());
System.out.println();
Customer c1=new Customer("Newton",30,new Adress("2-3-102/1","Ameerpet","Hyderabad","12345"));
Customer c2=new Customer("Eistene",23,new Adress("1-10-1022/3","Kukatpally","Hyderabad","23345"));
Customer c3=new Customer("Yuvi",31,new Adress("1-3-32","Ameerpet","Secbad","33345"));
Customer c4=new Customer("Dhoni",31,new Adress("1-3-32","Ameerpet","Secbad","33345"));
Customer c5=new Customer("Schin",31,new Adress("1-3-32","Ameerpet","Secbad","33345"));
Customer c6=new Customer("Michael Satner",31,new Adress("1-3-32","Ameerpet","Secbad","33345"));
Customer c7=new Customer("Justin",31,new Adress("1-3-32","Ameerpet","Secbad","33345"));
v.add(c1);
v.add(c2);
System.out.println("Reached its Capacity...Or not?");
System.out.println("Capacity:"+v.capacity());
System.out.println("Size :"+v.size());
System.out.println();
v.add(c3);
System.out.println("Reached its Capacity...Or not?");
System.out.println("Capacity:"+v.capacity());
System.out.println("Size :"+v.size());
System.out.println();
v.add(c4);
System.out.println("Reached its Capacity...Or not?");
System.out.println("Capacity:"+v.capacity());
System.out.println("Size :"+v.size());
System.out.println();
v.add(c5);
v.add(c6);
System.out.println("Reached its Capacity...Or not?");
System.out.println("Capacity:"+v.capacity());
System.out.println("Size :"+v.size());
System.out.println();
v.add(c7);
System.out.println("Reached its Capacity...Or not?");
System.out.println("Capacity:"+v.capacity());
System.out.println("Size :"+v.size());
System.out.println();
for(int i=0;i<v.size();i++)
{
System.out.println(v.get(i));
System.out.println();
}











	



}

}
