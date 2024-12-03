import java.util.*;

/*
           *
          ***
         *****
        *******
       @      @
       @      @
       @      @
       @      @
       @      @
*******@      @*******
 *****          *****
  ***            ***
   *              *
 */
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        for (int i =n/2; i>=0; i--) {
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <n-(i*2); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n; j++) {
                if (i==n-2) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            for (int j = 0; j <= n; j++) {
                if( j == 0 || j==n)
                {
                    System.out.print("@");
                }
                else{
                    System.out.print(" ");
                }
            }
            if (i==n-2) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
                
            }
            System.out.println();
            
        }



        

        for (int i = 1; i <= n/2; i++) {

        for (int j = 0; j <i; j++) {
            System.out.print(" ");
          }

            for (int j = 0; j < n-(i*2); j++) {
             System.out.print("*");   
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }


            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
           for (int j = 0; j <= i; j++) {
            System.out.print(" ");
          }

            for (int j = 0; j < n-(i*2); j++) {
             System.out.print("*");   
            }
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}
