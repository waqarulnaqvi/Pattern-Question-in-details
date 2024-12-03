/*
    *         *
   * *       * *
  * * *     * * *
 * * * *   * * * *
* * * *  * * * * *
 */

public class Pattern15 {
    public static void main(String[] args) {
        int n=10;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
                System.out.print("* ");

            for (int j = 1; j <i; j++) {
                if(i==n && j==n-1)
                {
                System.out.print(" ");
                }
                else
                {
                System.out.print("* ");
                } 
            }

            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            System.out.print("* ");

            for (int j = 1; j <i; j++) {
                System.out.print("* ");
                
            }

            System.out.println();
        }
    }
}
