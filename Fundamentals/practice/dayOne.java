import java.util.Scanner;

public class dayOne {
    // swap two variable without third variable
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // swap two variable with out temp variable

        // int a=10;
        // int b=20;
        // System.out.println(a+":"+b);
        // a=a+b;
        // b=a-b;
        // a=a-b;
        // System.out.println(a+":"+b);

        // check number is positive , negative or zero

        // System.out.print("Enter number: ");
        // int num = sc.nextInt();
        // if(num>0){
        // System.out.println("Number is positive: "+ num);
        // }
        // else if(num<0){
        // System.out.println("Number is negative: "+num);
        // }
        // else{
        // System.out.println("Number is Zero: "+num);
        // }

        // find the size of each primitive type

        // System.out.println("Size of Byte: "+Byte.SIZE);
        // System.out.println("Size of integer: "+Integer.SIZE);
        // System.out.println("Size of Float: "+Float.SIZE);
        // System.out.println("Size of Double: "+Double.SIZE);
        // System.out.println("Size of Long: "+Long.SIZE);
        // System.out.println("Size of Character: "+Character.SIZE);
        // System.out.println("Size of Short: "+Short.SIZE);

        // convert celsius to fahrenheit and reverse

        // System.out.print("Enter temperature in celsius: ");
        // int celsius = sc.nextInt();
        // int fahrenheit = celsius*(9/5)+32;
        // System.out.println("Celsius to fahrenheit: " + fahrenheit);

        // Calculate simple interest given P, R, T
        // p = principle amount
        // r = total interest or return amount
        // t = total time

        // System.out.print("Enter principle amount: ");
        // int p = sc.nextInt();
        // System.out.print("Enter total time in years: ");
        // int t = sc.nextInt();
        // int percentage = (p / 100) * 17;
        // int totalInterest = percentage * t;
        // int totalAmount = p+totalInterest;
        // System.out.println("Your total interest in " + t + " years is :" +
        // totalInterest
        // + " and your total returning amount is: " + totalAmount);

        // Find the largest of three numbers using only variables and operators

        // int a=50;
        // int b=40;
        // int c=30;
        // int largest = (a>b)?(a>c?a:c):(b>c?b:c);
        // System.out.println(largest);

        // check leap year

        // System.out.print("Enter year: ");
        // int leap = sc.nextInt();
        // if ((leap % 4 == 0 && leap % 100 != 0) || leap % 400 == 0) {
        // System.out.println("Leap year: " + leap);
        // } else {
        // System.out.println("Not a leap year: " + leap);
        // }

        // area and perimeter of rectangle

        // System.out.print("Enter length of rectangle: ");
        // int length = sc.nextInt();
        // System.out.print("Enter width of rectangle: ");
        // int width = sc.nextInt();

        // int area = length*width;
        // int perimeter = 2*area;
        // System.out.println("Area is: "+ area + " and perimeter is: "+ perimeter);

        // qoutient and remainder of integer

        // System.out.print("Enter First number, not zero: ");
        // int num1 = sc.nextInt();
        // System.out.print("Enter Second number, not zero: ");
        // int num2 = sc.nextInt();
        // if (num2 != 0) {
        //     int rem = num1 % num2;
        //     int qou = num1 / num2;
        //     System.out.println("Remainder is: " + rem + " and qou is: " + qou);
        // } else {
        //     System.out.println("Value not valid:");
        // }

        // is char is vowel or consonant 

        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("This is vowel: "+ ch);
        }
        else{
            System.out.println("This is consonant: "+ch);
        }
    }
}