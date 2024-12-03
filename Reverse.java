// Write a program to reverse a string in Java/Kotlin.
import java.util.*;
class Reverse{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a Number:");
      String str=sc.nextLine();
      String reverse="";
      for (int i = str.length()-1; i >=0 ; i--)
      {
             char ch=str.charAt(i);
             reverse+=ch;
      }
      System.out.println("Reverese Number is \n"+reverse);
    }
}