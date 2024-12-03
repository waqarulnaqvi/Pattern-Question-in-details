/*
1 
0 1
1 0 1
0 1 0 1
1 0 1 0 1
 */
public class Pattern22 {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        for (int j = 0; j < n; j++) {
            if (j%2==0)
            {
                i=1;
            }
            else{
                i=0;
            }
            for (int j2 = 0; j2 <= j; j2++) {
                System.out.print(String.format("%d ", i));
                if (i==1) i=0; else i=1;
            }
            System.out.println();
        }
    }
    
}
