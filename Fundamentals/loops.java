import java.util.*;

public class loops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // for loop

        // for(int i=1; i<=10;i++){
        // System.out.println(i);
        // }

        // do while loops

        // int i=1;
        // do{
        // System.out.println(i);
        // i++;
        // }
        // while(i<=10);

        // while loop

        // int j=1;
        // while(j<=10){
        // System.out.println(j);
        // j++;
        // }

        // sum of first n natural number

        // System.out.println("Enter last number: ");
        // int n = sc.nextInt();
        // int sum =0;
        // for(int i=1;i<n;i++){
        // sum +=i;
        // System.out.println(sum);
        // }
        // System.out.println(sum);

        // table of number

        // System.out.println("Enter Table Number: ");
        // int n = sc.nextInt();
        // for(int i =1; i<=10;i++){
        // System.out.println(n+" * "+i+" = "+n*i);
        // }

        // print even number

        // System.out.println("Enter Last Number: ");
        // int n = sc.nextInt();
        // for(int i=1;i<=n;i++){
        // if(i%2==0){
        // System.out.println(i);
        // }
        // }

        // menu driven program

        // int n = 1;
        // do {
        // System.out.println("Enter numbers out 100: ");
        // int numbers = sc.nextInt();
        // if (numbers >= 90) {
        // System.out.println("This is good.");
        // } else if (numbers >= 80) {
        // System.out.println("This is also good");
        // } else if (numbers >= 50) {
        // System.out.println("Average.");
        // } else {
        // System.out.println("Fail");
        // }
        // System.out.println("Enter Number 1 or 0: ");
        // n = sc.nextInt();
        // } while (n == 1);

        // prime number or not

        // System.out.println("Enter Number: ");
        // int n = sc.nextInt();
        // int count = 0;
        // if (n <= 1) {
        //     System.out.println("Not a prime number.");
        //     return;
        // }
        // for (int i = 2; i <=n/2; i++) {
        //     if (n % i == 0) {
        //         count++;
        //     }
        // }
        // if (count ==0) {
        //     System.out.println("Its a prime number.");
        // } else {
        //     System.out.println("Not a prime number.");
        // }

        // infinite loop 

        // int n=1;
        // do{
        //     System.out.println(n);
        //     n++;
        // }while(n>0);

        // fibonacci series 

        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for(int i=1;i<=num;i++){
           int c= a+b;
           System.out.print(c + " ");
           a=b;
           b=c;
           c=a;
        }

    }
}
