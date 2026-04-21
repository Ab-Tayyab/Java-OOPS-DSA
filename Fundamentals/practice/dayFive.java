import java.util.Scanner;

public class dayFive {
    // reverse of a number
    public static int reverse(int a) {
        int rev = 0;
        while (a > 0) {
            int digit = a % 10;
            rev = rev * 10 + digit;
            a = a / 10;
        }
        return rev;
    }

    // number of vowel in a string

    // public static int stringNumber(String s){
    // int count = 0;
    // for(int i=0;i<s.length();i++){
    // char ch = s.charAt(i);
    // if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
    // count++;
    // }
    // }
    // return count;
    // }

    // recursive method for factorial

    // public static int fac(int a){
    // if(a==0 || a==1)return 1;
    // return a*fac(a-1);
    // }

    // prime number from 1 to n

    // public static boolean isPrime(int a){
    // for(int i=2;i<=a/2;i++){
    // if(a%i==0){
    // return false;
    // }
    // }
    // return true;
    // }

    // recursive method for fibonacci series

    // public static int fibonacci(int n) {
    //    if(n<=1){
    //     return n;
    //    }
    //    return fibonacci(n-1)+fibonacci(n-2);
    // }

        // method for power without math.pow 

        public static int power(int b,int e){
            int result =1;
            for(int i=1;i<=e;i++){
                result*=b;
            }
            return result;
        }

        // recursive method for gcd 

        // public static int gcd(int a,int b){
        //    if (b==0){
        //     return a;
        //    }
        //    return gcd(b,a%b);
        // }

        // overloaded method area for circle, rectangle,triangle 

        // public static double area(double radius){
        //     return 3.14*radius*radius;
        // }
        // public static int area(int width,int length){
        //     return width*length;
        // }
        // public static double area(double base, double height){
        //     return 0.5*base*height;
        // }

        // perfect square of a number 

        // public static int square(int a){
        //     if(a<0) return -1;
        //     for(int i=1;i<a/2;i++){
        //         if(a == i*i){
        //             return i;
        //         }
        //     }
        //     return -1;
        // }

        // decimal to binary 

        // public static String decimalToBinary(int num){
        //     if(num==0) return "0";
        //     String  str= "" ;
        //     while(num>0){
        //         str=(num%2) + str;
        //         num = num/2;
        //     }
        //     return str;
        // }

        // or return intger value

        public static int decimalToBinary(int num){
            int binary = 0;
            int place = 1;
            while(num>0){
                int rem = num%2;
                binary += rem*place;
                place *=10;
                num /=2;
            }
            return binary;
}
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // decimal to binary 

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.println(decimalToBinary(num));

        // perfect square of a number 

        // System.out.print("Enter number: ");
        // int num= sc.nextInt();
        // int res = square(num);
        // if(res!=-1){
        //     System.out.println("Perfect square " + res);
        // }else{
        //     System.out.println("Not a perfect square "+ res);
        // }

        // overloaded method area for circle, rectangle,triangle 

        // System.out.println("Area of circle: "+ area(3.0));
        // System.out.println("Area of rectangle: "+ area(10,20));
        // System.out.println("Area of triangle: "+ area(3.0,4.0));


        // recursive method for gcd 

        // System.out.print("Enter number 1: ");
        // int num1=sc.nextInt();
        //  System.out.print("Enter number 2: ");
        // int num2=sc.nextInt();
        // System.out.println("GCD is: "+ gcd(num1, num2));


        // recursive method for febinocci series

        // System.out.print("enter number: ");
        // int num = sc.nextInt();
        // for (int i = 0; i < num; i++) {
        //     System.out.print(fibonacci(i) + ", ");
        // }

        // method for power without math.pow 

        // System.out.print("Enter base number: ");
        // int base = sc.nextInt();
        // System.out.print("Enter exponent: ");
        // int exponent = sc.nextInt();
        // System.out.println("Power is: "+ power(base,exponent));




        // reverse of a number
        // System.out.print("Enter number: ");
        // int a = sc.nextInt();
        // int rev = reverse(a);
        // System.out.println(("Original number is: "+ a + " and reverse number is: "+
        // rev));

        // number of vowel in a string
        // System.out.print("Enter string: ");
        // String s = sc.nextLine();
        // int n = stringNumber(s);
        // System.out.println("Total number of vowels ina string is: " + n);
        // }

        // recursive method for factorial
        // System.out.print("Enter number: ");
        // int a = sc.nextInt();
        // int n = fac(a);
        // System.out.println("Factorial of " + a + " is: " + n);

        // prime number method from 1 to n

        // System.out.print("Enter number: ");
        // int num = sc.nextInt();
        // for(int i=2;i<=num;i++){
        // if(isPrime(i)){
        // System.out.println(i + "-> Prime number.");
        // }
        // else{
        // System.out.println(i + "-> Not a Prime number.");
        // }
        // }

    }
}
