/*
  *
 ***
*****
 ***
  *
 */

public class Pattern10 {
    public static void main(String[] args) {
        int n=5;
        for (int i = n/2; i >=0 ; i--) {
            
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-(i*2); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <=n/2 ; i++) {
            
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-(i*2); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
