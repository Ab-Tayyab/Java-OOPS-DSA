import java.util.Scanner;

public class dayThree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // table of give number

        // System.out.print("Enter number: ");
        // int table = sc.nextInt();
        // for(int i=1;i<11;i++){
        // System.out.println(table + " X " + i+ " = "+table*i);
        // }

        // sum of all even number

        // System.out.println("Enter last digit: ");
        // int num = sc.nextInt();
        // int sum =0;
        // for(int i=1;i<=num;i++){
        // if(i%2==0){
        // sum+=i;
        // }
        // }
        // System.out.println("Sum of 1 to "+num + " is: "+ sum );

        // // find sum of digits of a number

        // System.out.print("Enter number: ");
        // int number = sc.nextInt();
        // int sum = 0;
        // while(number>0){
        // int digit = number%10;
        // System.out.println(digit);
        // sum += digit;
        // number = number/10;
        // }
        // System.out.println(sum);

        // reverse a number

        // System.out.print("Enter number: ");
        // int num = sc.nextInt();
        // int reverse = 0;
        // while(num>0){
        // int digit = num%10;
        // reverse = reverse*10+digit;
        // num = num/10;
        // }
        // System.out.println(reverse);

        // check number is palindrome or not;

        // System.out.print("Enter Number: ");
        // int pal = sc.nextInt();
        // int ori = pal;
        // int rev = 0;
        // while(pal>0){
        // int digit = pal%10;
        // rev = rev*10+digit;
        // pal=pal/10;
        // }
        // if(ori==rev){
        // System.out.println("Palindrome Number. Original = " + ori + " Reverse =
        // "+rev);
        // }
        // else{
        // System.out.println("Not a Palindrome Number. Original = " + ori + " Reverse =
        // "+rev);
        // }

        // factorial of number n

        // System.out.print("Enter number: ");
        // int num = sc.nextInt();
        // long fac = 1;
        // for(int i =1;i<=num;i++){
        // fac = fac*i;
        // }
        // System.out.println("Factorial of "+num + " is: "+fac);

        // count number of digits in an integer

        // System.out.print("Enter integer: ");
        // int num = sc.nextInt();
        // int count=0;
        // while(num>0){
        // num = num /10;
        // count++;
        // }
        // System.out.println("Total digit in an integer: " + count);

        // print fibonacci series from 1 to n

        // System.out.print("Enter number: ");
        // int fab = sc.nextInt();
        // int a = 0;
        // int b = 1;
        // System.out.print(a + " , " + b );
        // for (int i = 2; i <= fab; i++) {
        // int c = a + b;
        // System.out.print(" , "+c);
        // a=b;
        // b=c;
        // }

        // armstrong number

        // System.out.print("Enter number: ");
        // int arm = sc.nextInt();
        // int ori = arm;
        // // int temp = arm;
        // int sum = 0;
        // // int count = 0;
        // int noLoopCount = String.valueOf(arm).length();
        // System.out.println(noLoopCount);
        // // while (temp > 0) {
        // //     temp = temp / 10;
        // //     count++;
        // // }
        // while (arm > 0) {
        //    int digit = arm % 10;
        //     // sum += (int)Math.pow(digit, count);
        //     sum += (int)Math.pow(digit, noLoopCount);
        //     arm = arm/10;
        // }
        // if (sum == ori) {
        //     System.out.println("Its armstrong number: " + sum + " and " + ori);
        // } else {
        //     System.out.println("Its not a armstrong number: " + sum + " and " + ori);
        // }

        // prime number from 1 to n

        // System.out.print("Enter number: ");
        // int prime = sc.nextInt();

        // for (int i = 2; i < prime; i++) {
        // if (isPrime(i)) {
        // System.out.println("Prime number: " + i);
        // }
        // }

    }

    // public static boolean isPrime(int num) {
    // if (num <= 1)
    // return false;
    // for (int i = 2; i <= num/2; i++) {
    // if (num%i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }
}
