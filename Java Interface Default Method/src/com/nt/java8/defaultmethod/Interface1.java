package com.nt.java8.defaultmethod;
public interface Interface1 {
void method1(String str);
default void log(String str){
System.out.println("I1 logging::"+str);
}

}