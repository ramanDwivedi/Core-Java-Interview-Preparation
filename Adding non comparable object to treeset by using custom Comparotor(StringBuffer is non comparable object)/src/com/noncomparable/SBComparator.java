package com.noncomparable;

import java.util.Comparator;
public class SBComparator implements Comparator {
public int compare(Object obj1,Object obj2)
{
StringBuffer sb1=(StringBuffer)obj1;
StringBuffer sb2=(StringBuffer)obj2;
String s1=sb1.toString();
String s2=sb2.toString();
return s2.compareTo(s1);
}
}
