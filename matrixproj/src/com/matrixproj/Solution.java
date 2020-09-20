package com.matrixproj;

import java.util.Scanner;

public class Solution {
public static void smallestInRow(int mat[][], int n, int m)
{
System.out.print("{");
for(int i=0;i<n;i++)
{
int min=mat[i][0];
for(int j=1;j<m;j++)
{
if(mat[i][j]<min)
min=mat[i][j];
}
System.out.print(min+" ");
}
System.out.println("}");
}
public static void greatestInColumn(int mat[][], int n, int m)
{
System.out.print("{");
for(int i=0;i<m;i++)
{
int max=mat[0][i];
for(int j=1;j<n;j++)
{
if(mat[j][i]>max)
max=mat[j][i];
}
System.out.print(max+" ");
}
System.out.println("}");
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the No. of rows");
int n=sc.nextInt();
System.out.println("Enter the No. of Columns");
int m=sc.nextInt();
int mat[][]=new int [n][m];
System.out.println("Enter the matrix Elements");
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
mat[i][j]=sc.nextInt();
}
}
System.out.println("Elements of matrix");
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
System.out.print(mat[i][j]+" ");
}
System.out.println();
}
System.out.println("Minimum elements of each row in the matrix");
smallestInRow(mat, n, m);
System.out.println("Maximum elements of each row in the matrix");
greatestInColumn(mat, n, m);
}
}
