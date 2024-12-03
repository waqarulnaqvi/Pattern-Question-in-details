

public class Pattern11 {
    public static void main(String[] args) {
/*
    * 
   * *
  * * *
* * * * *
  * * *
   * *
    *
 */
        int n=4;
        int j=1;



        for (int i = 1; i <= n*2; i++) {
            for (int k = -1; k < n-j; k++) {
                System.out.print(" ");
            }
  
            for (int k = 1; k <= j; k++) {
                System.out.print("* ");
            }
            if(i>n)
            {
                j--;
            }
            else if(i==n-1)
            {
                j+=2;
            }
            else if (i==n)
            {
                j-=2;
            }
            else{
                j++;
            }
            System.out.println();
        }

    }
}
