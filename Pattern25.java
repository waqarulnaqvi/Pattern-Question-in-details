/*
    1 
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
 1 2 3 4
  1 2 3
   1 2
    1 
 */
public class Pattern25 {
    public static void main(String[] args) {
        
    int n=5;
    int j=1;



    for (int i = 1; i <= n*2; i++) {
        for (int k = 0; k < n-j; k++) {
            System.out.print(" ");
        }

        for (int k = 1; k <= j; k++) {
            System.out.print(k+" ");
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