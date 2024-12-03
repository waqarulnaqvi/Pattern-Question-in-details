/*
             *
            ***
           *****
          *******
@@@@@@@@@*********
          *******
           *****
            ***
             *
*/
public class Pattern18 {
    public static void main(String[] args) {
        int n=5;
        /*My Method :*/
        int z=1;
        for (int i = 1; i <= n*2-1; i++) {

            for (int j = 1; j <= n*2-1; j++) {
                if (i==n) {
                    System.out.print("@");
                }
                else{
                    System.out.print(" ");
                }
            }

            for (int j = n-z; j >0; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j < z; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < z; j++) {
                System.out.print("*");
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
