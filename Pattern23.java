/*
    * 
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
 */
public class Pattern23 {
    public static void main(String[] args) {
        
    int n=5;
    int j=1;

    for (int i = 1; i <= n*2; i++) {
        for (int k = 0; k < n-j; k++) {
            System.out.print(" ");
        }

        for (int k = 1; k <= j; k++) {
            if (k==1 ||k==j) {
                System.out.print("* "); 
            }
            else{
                System.out.print("  ");
            }
           
        }
        if(i>=n)
        {
            j--;
        }
        else{
            j++;
        }
        System.out.println();
    }

}
}