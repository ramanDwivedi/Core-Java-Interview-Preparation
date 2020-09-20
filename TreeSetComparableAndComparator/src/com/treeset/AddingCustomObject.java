package com.treeset;
import java.util.TreeSet;
public class AddingCustomObject {
public static void main(String[] args) {
/*
-Creating a treset object using no-arg constructor,
-So elements are sorted according to natural sorting order of adding object 
 */
TreeSet ts=new TreeSet();
//add elements to  TreeSet
ts.add("C");
ts.add("A");
ts.add("B");
ts.add("E");
ts.add("F");
ts.add("D");
System.out.println("ts object with default comparator:"+ts);
/*
 -Creating a treset object using comparator constructor,
 -So elements are sorted according to custom sorting order of adding object 
*/
TreeSet tsc=new TreeSet(new Example());
tsc.add("C");
tsc.add("A");
tsc.add("B");
tsc.add("E");
tsc.add("F");
tsc.add("D");
System.out.println("ts object with custom comparator:"+tsc);
}

}
