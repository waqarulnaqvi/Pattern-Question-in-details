/*
**********
 ********
  ******
   ****
    **
    **
   ****
  ******
 ********
**********
 */
import java.util.*;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=sc.nextInt();
        int cal=0;
        if(n%2==0)
        {
            cal=n/2-1;
        }
        else{
            cal=n/2;
        }

        for (int i = 0; i <=cal; i++) {
            for(int j=0;j<i;j++)
            {
            System.out.print(" ");
        }
        for (int j = 0; j < n-(2*i); j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    for (int i = cal; i >=0; i--) {
        for(int j=0;j<i;j++)
        {
        System.out.print(" ");
    }
    for (int j = 0; j < n-(2*i); j++) {
        System.out.print("*");
    }
    System.out.println();
        
    }
 }
}
