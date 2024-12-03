public class Pattern8 {
/*
* 
* *
* * *
* * * *
* * * *
* * *
* *
* 
*/
    public static void main(String[] args) {
        int n=4;
        int j=1;
        for (int i = 1; i <= n*2; i++) {
  
            for (int k = 1; k <= j; k++) {
                System.out.print("* ");
            }
            if(i>n)
            {
                j--;
            }
            else if(i==n)
            {
          //Continue
            }
            else{
                j++;
            }
            System.out.println();
        }
    }
}
