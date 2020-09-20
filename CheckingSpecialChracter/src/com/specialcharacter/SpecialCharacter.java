package com.specialcharacter;
import java.util.Scanner;

public class SpecialCharacter {
private static int checkString(String input) {
char currentCharacter;
int spCount=0;
boolean numberPresent = false;
boolean upperCasePresent = false;
boolean lowerCasePresent = false;
boolean specialCharacterPresent = false;
for (int i = 0; i < input.length(); i++) {
currentCharacter = input.charAt(i);
if (Character.isDigit(currentCharacter)) {
numberPresent = true;
}
else if (Character.isUpperCase(currentCharacter)) {
upperCasePresent = true;
} 
else if (Character.isLowerCase(currentCharacter)) {
lowerCasePresent = true;
} 
else  {
spCount++;
}
}
return  spCount;
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);	
System.out.print("Enter the String");
System.out.println();
System.out.println(checkString(sc.nextLine()));

}
}
