import java.util.Scanner;

public class dayTwo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // grade system print

        // System.out.print("Enter your number outof 100: ");
        // int grade = sc.nextInt();
        // if (grade >= 90) {
        // System.out.println("You got A grade.");
        // } else if (grade >= 80) {
        // System.out.println("You got B grade.");
        // } else if (grade >= 65) {
        // System.out.println("You got C grade.");
        // } else if (grade >= 50) {
        // System.out.println("You got D grade.");
        // } else {
        // System.out.println("You got F grade.");
        // }

        // find the largest of four number using just if else

        // int a=10;
        // int b=50;
        // int c=30;
        // int d=40;
        // if(a>b && a>c && a>d){
        // System.out.println("Largest value is: "+a);
        // }
        // else if(b>a && b>c && b>d){
        // System.out.println("Largest value is: "+b);
        // }
        // else if(c>a && c>b && c>d){
        // System.out.println("Largest value is: "+c);
        // }
        // else{
        // System.out.println("Largest value is: "+d);
        // }

        // or

        // int largest = 0;
        // int a = 10;
        // int b = 50;
        // int c = 30;
        // int d = 60;
        // if (a > b) {
        // largest = a;
        // } else {
        // largest = b;
        // }
        // if (c > largest) {
        // largest = c;
        // }
        // if (d > largest) {
        // largest = d;
        // }
        // System.out.println("Largest value is: " + largest);

        // check number is divisible or not by 3 and 5

        // System.out.print("Enter number: ");
        // int num = sc.nextInt();
        // if (num % 3 == 0 && num % 5 == 0) {
        // System.out.println("Number is divisible by 3 and 5.");
        // } else {
        // System.out.println("Number is not divisible by 3 and 5.");
        // }

        // simple calculator using switch

        // System.out.print("Enter first value: ");
        // int v1 = sc.nextInt();
        // System.out.print("Enter Second value: ");
        // int v2 = sc.nextInt();
        // System.out.print("Enter Operation which you want to perform: 1 for +, 2 for
        // -, 3 for *, 4 for /, 5 for %: ");
        // int op = sc.nextInt();
        // switch (op) {
        // case 1:
        // System.out.println("Addition is: " + (v1 + v2));
        // break;
        // case 2:
        // System.out.println("Subtraction is: " + (v1 - v2));
        // break;
        // case 3:
        // System.out.println("multiplication is: " + (v1 * v2));
        // break;
        // case 4:
        // if (v2 == 0 || v2>v1) {
        // System.out.println("Invalid value: value should greater then zero or less
        // then value 1:");
        // break;
        // } else {
        // System.out.println("Division is: " + (v1 / v2));
        // break;
        // }
        // case 5:
        // if (v2 == 0) {
        // System.out.println("Invalid value" + v2);
        // break;
        // } else {
        // System.out.println("Remainder is: " + (v1 % v2));
        // }
        // break;
        // default:
        // System.out.println("Invalid value");
        // break;
        // }

        // Determine the type of a triangle (equilateral, isosceles, scalene)

        // System.out.print("Enter first length of triangle: ");
        // int l1=sc.nextInt();
        // System.out.print("Enter second length of triangle: ");
        // int l2 = sc.nextInt();
        // System.out.print("Enter third length of triangle: ");
        // int l3 = sc.nextInt();
        // if(l1 == l2 && l2 == l3){
        // System.out.println("It's Equilateral triangle");
        // }
        // else if(l1 == l2 || l2 == l3 || l3 == l1){
        // System.out.println("It's Isosceles triangle");
        // }
        // else{
        // System.out.println("It's Scalene triangle");
        // }

        // check number is even odd with out modulus operator %

        // System.out.print("Enter number: ");
        // int num = sc.nextInt();
        // int div = num/2;
        // if(div*2 == num){
        // System.out.println("Even number: "+ num);
        // }
        // else{
        // System.out.println("Odd number: "+ num);
        // }

        // check character is uppercase, lowercase, number or special chaeracter

        // System.out.print("Enter single charater: ");
        // char ch = sc.next().charAt(0);
        // if(ch >= 'a' && ch<='z' ){
        // System.out.println("It's a lower case letter: "+ ch);
        // }
        // else if(ch >= 'A' && ch<='Z' ){
        // System.out.println("It's a upper case letter: "+ ch);
        // }
        // else if(ch >='0' && ch<'9' ){
        // System.out.println("It's a digit: "+ ch);
        // }
        // else{
        // System.out.println("Its a special character: "+ ch);
        // }

        // find day name using switch

        // System.out.print("Enter number for 1=Monday, 2=Tuesday, 3=Wednesday,
        // 4=Thursday, 5=Friday, 6=Saturday, 6=Sunday: ");
        // int num = sc.nextInt();
        // switch (num) {
        // case 1:
        // System.out.println("Monday!");
        // break;
        // case 2:
        // System.out.println("Tuesday!");
        // break;
        // case 3:
        // System.out.println("Wednesday!");
        // break;
        // case 4:
        // System.out.println("Thursday!");
        // break;
        // case 5:
        // System.out.println("friday!");
        // break;
        // case 6:
        // System.out.println("Saturday!");
        // break;
        // case 7:
        // System.out.println("Sunday!");
        // break;

        // default:
        // System.out.println("Invalid number!");
        // break;
        // }

        // can three side make triangle

        // int a = 10;
        // int b = 20;
        // int c = 29;
        // int l=0;
        // int m=0;
        // int s=0;
        // if(a>=b && a>c){
        //     l = a;
        //     m=b;
        //     s=c;
        // }
        // else if(b>a && b>c){
        //     l=b;
        //     m=a;
        //     s=c;
        // }
        // else{
        //     l=c;
        //     m=a;
        //     s=b;
        // }
        // if (s+m > l) {
        //     System.out.println("Possibele to make triangle: " + s+" + "+ m + " > "+ l);
        // } else {
        //     System.out.println("Not Possibele to make triangle: "+s+" + "+ m + " > "+ l);
        // }

        // // or 

        // if(a+b>c && a+c>b && b+c>a){
        //      System.out.println("Possibele to make triangle: " + s+" + "+ m + " > "+ l);
        // } else {
        //     System.out.println("Not Possibele to make triangle: "+s+" + "+ m + " > "+ l);
        // }

        // absolute value 

        int n= -10;
        int abs;
        if(n<0){
            abs = -n;
            System.out.println("Absolute is: "+ abs);
        }
        else{
            abs = n;
            System.out.println("Absolute is: "+ abs);
        }
    }
}
