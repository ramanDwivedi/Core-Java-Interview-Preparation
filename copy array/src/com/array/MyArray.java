package com.array;
import java.util.Arrays;
public class MyArray {
public static int removrDuplicate(int[] a) {
int j = 0;
for (int i = 0; i < a.length - 1; i++) {
if (a[i] != a[i + 1]) {
a[j++] = a[i];
}
}
a[j++] = a[a.length - 1];
return j;
}

public static void main(String[] args) {
int a[] = { 5, 1, 2, 6, 4, 4, 5 };
Arrays.sort(a);
int n=removrDuplicate(a);
for(int i=0;i<n;i++)
System.out.print(a[i]+" ");	
}
}
