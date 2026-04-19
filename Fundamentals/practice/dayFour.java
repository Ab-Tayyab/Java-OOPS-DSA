import java.util.Scanner;

public class dayFour {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // print the right angled star triangle pattern

        // int n =5;
        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=i;j++){
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        // print inverted star triangle

        // int n = 5;
        // for (int i = n; i > 0; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        // hollow square of star

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // if(j==1 || i==1 || i==n || j==n){
        // System.out.print(" * ");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // print diamond star pettern

        int n = 3;
        int col =1;
        for (int i = 1; i <= n; i++) {
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= col; j++) {
               System.out.print("*");
            }
            col = col+2;
            System.out.println();
        }
        int m=3;
        for (int i = 1; i < n; i++) {
            for(int j=i;j>0;j--){
                System.out.print(" ");
            }
            for (int j = 1; j <=m; j++) {
               System.out.print("*");
            }
            m -=2;
            System.out.println();
        }
    }
}
