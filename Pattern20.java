/*
* * * * 

*     *

*     *

*     *

* * * *
 */
public class Pattern20 {
    public static void main(String[] args) {
        int n=4;
        for (int i = 0; i <= n; i++) {
           for (int j = 1; j <=n ; j++) {
            if(i==0 || i==n ||j==1 ||j==n )
            {
            System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
           }

           System.out.println("\n");
        }
    }
}
