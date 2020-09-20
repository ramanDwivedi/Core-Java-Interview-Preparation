package com.treeset;
import java.util.Comparator;
public class Example implements Comparator {
public int compare(Object a,Object b)
{
String astr,bstr;
astr=(String)a;
bstr=(String)b;
//reverse the comparison
return bstr.compareToIgnoreCase(astr);
}
}
