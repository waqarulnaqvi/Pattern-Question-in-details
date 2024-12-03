public class Pattern6 {
    public static void main(String[] args) {
        int n=9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i<n/2 &j<i || i==n/2 ||i>n/2 &j<n-i)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            if(i==n/2-1 || i==n/2+1)
            {
                System.out.print(" *");
            }
            
            if (i==n/2) {
                System.out.print("***");
            }
            System.out.println();
            
        }
    }
}
