import java.util.Scanner;

public class dayFive {
        // reverse of a number 
        public static int reverse(int a){
            int rev = 0;
            while(a>0){
                int digit = a%10;
                rev = rev*10+digit;
                a = a/10;
            }
            return rev;
        }

    // number of vowel in a string 

    // public static int stringNumber(String s){
    //     int count = 0;
    //     for(int i=0;i<s.length();i++){
    //         char ch = s.charAt(i);
    //         if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    // recursive method for factorial 

    public static int fac(int a){
        if(a==0 || a==1)return 1;
        return a*fac(a-1);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // reverse of a number 
    //     System.out.print("Enter number: ");
    //     int a = sc.nextInt();
    //     int rev = reverse(a);
    //     System.out.println(("Original number is: "+ a + " and reverse number is: "+ rev));

    // number of vowel in a string 
    // System.out.print("Enter string: ");
    // String s = sc.nextLine();
    // int n = stringNumber(s);
    // System.out.println("Total number of vowels ina string is: " + n);
    // }

        // recursive method for factorial
    System.out.print("Enter number: ");
    int a = sc.nextInt();
    int n = fac(a);
    System.out.println("Factorial of " + a + " is: " + n);
    }


}
