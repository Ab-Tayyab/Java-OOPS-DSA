import java.util.Scanner;

public class functionAndMethods {

    // // sum of two numbers
    // public static int sumOfNumbers(int num1, int num2) {
    // return num1 + num2;
    // }

    // // multiplication of two numbers
    // public static int multiplyOfNumbers(int a, int b) {
    // return a * b;
    // }

    // // factorial of a number

    // public static void factorialOfNumber(int a){
    // if(a<0){
    // System.out.println("Invalid number, Cannot calculate factorial: ");
    // return;
    // }
    // int fac = 1;
    // for(int i=1;i<=a;i++){
    // fac = fac*i;
    // }
    // System.out.println("Factorial is: "+ fac);
    // return ;
    // }

    // // prime number

    // public static void isPrime(int a){
    // int count = 0;
    // if(a<=1){
    // System.out.println("Number is not prime! ");
    // return;
    // }

    // for(int i=2;i<=a/2;i++){
    // if(a%i==0){
    // count++;
    // }

    // }
    // if(count==0){
    // System.out.println("Number is prime");
    // return;
    // }
    // else{
    // System.out.println("Number is not prime");
    // return;

    // }
    // }

    // even odd number

    // public static void checkNumber(int a) {
    // if (a % 2 == 0) {
    // System.out.println("Even number: ");
    // return;
    // } else {
    // System.out.println("Odd number: ");
    // return;
    // }
    // }

    // generate table

    // public static void tableNumber(int a){
    // for(int i=1;i<=10;i++){
    // System.out.println(a + " X " + i + " : " + a*i);
    // }
    // return;
    // }

    // public static int average(int a,int b, int c){
    // return (a+b+c)/3;
    // }

    // sum of odd number

    // public static int sumOfOddNumber(int a){
    // int sum =0;
    // for(int i=1;i<=a;i++){
    // if(i%2!=0){
    // sum += i;
    // }
    // }
    // return sum;
    // }

    // greater of two number

    // public static int greaterNumber(int a,int b){
    // if(a>b){
    // return a;
    // }
    // else{
    // return b;
    // }
    // }

    // circumference of a circle

    // public static double circumference(double r){
    // return 2*Math.PI*r;
    // }

    // aligible for vote or note

    public static void ageForVote(int a) {
        Scanner sc = new Scanner(System.in);
        if (a > 18) {
            System.out.println("Enter your country name: ");
            String nationality = sc.nextLine();
            if (nationality.equals("Pakistan") || nationality.equals("pakistan")) {
                System.out.println("You are aligible for vote.");
            } else {
                System.out.println("Your are not pakistani.");
            }
        } else {
            System.out.println("You are under age.");
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = sc.nextInt();
        // System.out.println("Enter second number: ");
        // int secondNumber = sc.nextInt();
        // System.out.println("Enter third number: ");
        // int thirdNumber = sc.nextInt();

        // aligible for vote or not
        ageForVote(firstNumber);

        // circumference if a circle
        // System.out.println("Circumference of a circle is:
        // "+circumference(firstNumber));

        // greater of two number
        // System.out.println("Greater number is: "+greaterNumber(firstNumber,
        // secondNumber));

        // sum of odd number
        // System.out.println("Sum of odd number is: "+sumOfOddNumber(firstNumber));

        // average of 3 numbers
        // System.out.println("Average of 3 number is:
        // "+average(firstNumber,secondNumber,thirdNumber));

        // // sum of number
        // int sum = sumOfNumbers(firstNumber, secondNumber);
        // System.out.println("Sum is: " + sum);

        // // product of number
        // System.out.println("Multiply is: " + multiplyOfNumbers(firstNumber,
        // secondNumber));

        // // factorial of number
        // factorialOfNumber(firstNumber);

        // number is prime
        // isPrime(firstNumber);

        // even odd number
        // checkNumber(firstNumber);

        // table of number
        // tableNumber(firstNumber);

    }

}
