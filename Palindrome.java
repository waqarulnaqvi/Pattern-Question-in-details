// Write a function to check if a given string is a palindrome.
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
        System.out.println("Enter a Number:");
        int ele=sc.nextInt();
        int pal=ele;
        int rev=0,rem;
        int flag=0;
        if (ele>= 1 && ele <=9) {
            flag=1;
        }
        else{
            while(pal!=0)
            {
                rem=pal%10;
                rev=rev*10+rem;
                pal=pal/10;
            }
        }
        if (flag==1||rev==ele)
        {
            System.out.println(String.format("Palindrome Number %d",ele));
        }
        else{
            System.out.println(String.format("It is not Palindrome Number %d", ele));
        }
    }
}
}
