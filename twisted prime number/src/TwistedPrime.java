import java.util.Scanner;

public class TwistedPrime {
public static boolean isPrime(int n)
{
if(n<=1)
return false;
for(int i=2;i<n;i++)
if(n % i == 0)
return false;
return true;	
}
	
public static void main(String[] args) {
System.out.println("prime number from 1 to 100");
for(int i=1;i<=100;i++)
{
if(isPrime(i))
System.out.print(i+" ");	
}
}

}
