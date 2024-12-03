/*
1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
public class Pattern21 {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        for (int j = 0; j < n; j++) {
            for (int j2 = 0; j2 <= j; j2++) {
                System.out.print(String.format("%d ", i));
                i+=1;
            }
            System.out.println();
        }
    }
}
