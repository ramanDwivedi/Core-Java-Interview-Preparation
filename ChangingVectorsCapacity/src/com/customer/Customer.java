package com.customer;
import com.address.Adress;
public class Customer {
String name;int age;
Adress address;
public Customer(String name, int age, Adress address) {
this.name = name;
this.age = age;
this.address = address;
}
public String toString()
{
return ( 
		"Name:"+name+"\nAge:"+age+
		"\nH.No:"+address.hno+"\nStreet:"+address.street+
		"\nCity:"+address.city+"\nPH"+address.ph
		);
		
}

}
