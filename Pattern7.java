/*     
       *
      ***
       *
       *
     *****
       *
       *
       *
    *******
       *
       *
       *
       *
   *********
       *
       *
       *
       *
       *
  ***********
       *
       *
       *
       *
       *
       *
 *************
       *
       *
       *
       *
       *
       *
       *
***************
 */

public class Pattern7 {
    public static void main(String[] args) {
        int n=7,k=1;
        int first=0;
        for(int i=n;i>=0;i--)
        {

            for (int j = 1; j < k; j++) {
                 for (int l = 0; l < n-1; l++) {
                System.out.print(" ");
            }
                System.out.println(" *");
            }
            k+=1;
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (n*2)-(i*2-1); j++) {
                if(first==0)
                {
                    continue;
                }
                System.out.print("*");
            }
            first=1;
            System.out.println();
        }
    }
}
