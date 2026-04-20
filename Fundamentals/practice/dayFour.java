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

        // int n = 3;
        // int col =1;
        // for (int i = 1; i <= n; i++) {
        // for(int j=n;j>i;j--){
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= col; j++) {
        // System.out.print("*");
        // }
        // col = col+2;
        // System.out.println();
        // }
        // int m=3;
        // for (int i = 1; i < n; i++) {
        // for(int j=i;j>0;j--){
        // System.out.print(" ");
        // }
        // for (int j = 1; j <=m; j++) {
        // System.out.print("*");
        // }
        // m -=2;
        // System.out.println();
        // }

        // pascal pyramid

        // int n = 5;
        // for (int i = 0; i < n; i++) {
        // for (int j = i; j <n; j++) {
        // System.out.print(" ");
        // }
        // int num=1;
        // for (int k = 0; k <= i; k++) {
        // System.out.print(num + " ");
        // num=num*(i-k)/(k+1);
        // }
        // System.out.println();
        // }

        // lcm of a two number

        // System.out.print("Enter first number: ");
        // int a = sc.nextInt();
        // System.out.print("Enter second number: ");
        // int b = sc.nextInt();
        // int max = Math.max(a, b);
        // while (true) {
        //     if (max % a == 0 && max % b == 0) {
        //         System.out.println("LCM is: " + max);
        //         break;
        //     }
        //     max++;
        // }

        // n is a perfect number 

        // System.out.print("Enter number: ");
        // int num = sc.nextInt();
        // int sum = 0;
        // for(int i=1;i<=num/2;i++){
        //     if(num%i==0){
        //         sum+=i;
        //     }
        // }
        // if(sum == num){
        //     System.out.println("Its a perfect number: sum = "+ sum + " original number is = "+num);
        // }
        // else{
        //     System.out.println("Its not a perfect number: sum = "+ sum + " original number is = "+num);
        // }

        // find sum of series (1+1/2+1/3+1/4...)

        // System.out.print("Enter number: ");
        // int num = sc.nextInt();
        // double sum= 0;
        // for(int i=1;i<=num;i++){
        //     sum+=1.0 /i;
        // }
        // System.out.println("Sum is: "+ sum);

        // all facter of  number 

        // System.out.print("Enter number: ");
        // int num=sc.nextInt();
        // for(int i=1;i<=num;i++){
        //     if(num%i==0){
        //         System.out.print(i + ", ");
        //     }
        // }

        // HCF adn GCD of two numbers

          System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int min = Math.min(a, b);
        int hcf = 1;
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                hcf = i;
        }
        }
        System.out.println("HCF is: "+ hcf);

    }
}
