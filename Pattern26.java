/*
   1
  212
 32123
4321234
 32123
  212
   1
 */

public class Pattern26 {
    public static void main(String[] args) {
        int n=4;
        /*My Method :*/
        int z=1;
        for (int i = 1; i <= n*2-1; i++) {

            for (int j = n-z; j >0; j--) {
                System.out.print(" ");
            }

            for (int j = z; j > 1; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <= z; j++) {
                System.out.print(j);
            }
            if (i>=n) {
                z-=1;
            }
            else{
            z+=1;
            }
            System.out.println();
            
        }
    }
}