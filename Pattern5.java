/*
@
@
@
@******
@     ******
@          ******              @
@               ******         @
@                    ******    @
                          *****@
                               @
                               @
                               @
 */
public class Pattern5 {
    public static void main(String[] args) {
        int n=6;
        int x=0;
        for(int i=0;i<2*n;i++)
        {
            boolean flag=false;
            if(i<=n+1)  System.out.print("@"); else System.out.print(" ");

            for (int j = 0; j < n*(n-1); j++) {
                if (i>=n/2 && i<2*n-n/2) {
                    if (j<(n-1)*x || j>(n-1)*x+n-1) {
                        // System.err.print((n-1)*x);
                        System.out.print(" ");
                        // System.err.print((n-1)*x+n-1);
                        // System.out.print(" ");

                    }
                    else{
                     System.out.print("*");
                     flag=true;
                }
            }
                else{
                    System.out.print(" ");
                }
                
            }
            if (flag) {
                x+=1;
            }
            if(i>=n-1)  System.out.print("@"); else System.out.print(" ");

            System.out.println();
        }
    }
}
