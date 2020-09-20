package com.revesearray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Solution {
public static void main(String[] args) {
// Create a list of strings 
ArrayList<String> al = new ArrayList<String>(); 
al.add("Geeks For Geeks"); 
al.add("Friends"); 
al.add("Dear"); 
al.add("Is"); 
al.add("Superb"); 
/* Collections.sort method is sorting the 
elements of ArrayList in ascending order. */
Collections.sort(al,Collections.reverseOrder()); 
// Let us print the sorted list 
System.out.println(al); 
	




}

}
