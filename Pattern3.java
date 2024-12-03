/*
*        
**
***
****      *
************
****      *
***
**       
*
 */
import java.util.*;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a Number:");
        int n = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < n / 2 && j <= i || i > n / 2 && j < n - i || i == n / 2) {
                    System.err.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            if (i == n / 2 - 1 || i == n / 2 + 1) {
                System.out.print(" *");
            } else if (i == n / 2) {
                System.out.print("***");
            }
            System.out.println();
        }
    }
}
