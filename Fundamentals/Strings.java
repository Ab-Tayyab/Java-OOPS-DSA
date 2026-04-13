import java.util.Scanner;

public class Strings {
    public static void main(String args[]) {
        // strings are immutable, you can to edit or change string one it created
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your First name: ");
        // String name = sc.nextLine();
        // System.out.println("Enter your Second name: ");
        // String name2 = sc.nextLine();
        // System.out.println("First name is " + name);
        // System.out.println("Second name is " + name2);

        // concatination of string
        // System.out.println("My fullname is: " + name + " " + name2);

        // length of string
        // String fullname = name + name2;
        // System.out.println("Length of string is: " + fullname.length());

        // compare of two strings
        // if (name.compareTo(name2) == 0) {
        // System.out.println("Both are equals");
        // } else {
        // System.out.println("Both are not equals");
        // }

        // we dont use == because some cases it give wrong answer
        // if (name == name2) {
        // System.out.println("Both are equals");
        // } else {
        // System.out.println("Both are not equals");
        // }

        // sub strings
        // String substr = fullname.substring(9, fullname.length());
        // System.out.println("Sub String is: " + substr);

        // parseInt Method of Integer class
        // String number = "123";
        // int chNumber = Integer.parseInt(number);
        // System.out.println(chNumber);

        // To String Method of String class
        // int num = 123;
        // String chNum = Integer.toString(num);
        // System.out.println(chNum);
        // System.out.println("Length of string after convert number to string is
        // :"+chNum.length());

        // Take an array of Strings input from the user & find the cumulative (combined)
        // length of all those strings

        // System.out.println("Enter size of String array");
        // int size = sc.nextInt();
        // sc.nextLine();
        // int count = 0;
        // String [] str = new String[size];
        // for(int i=0;i<size;i++){
        // System.out.print("Enter " + i+" value: ");
        // str[i]= sc.nextLine();
        // count += str[i].length();
        // }
        // System.out.println("Length of cumulative string array is: "+ count);

        // Input a string from the user. Create a new string called ‘result’ in which
        // you will replace the letter ‘e’ in the original string with letter ‘i’.

        // System.out.println("Enter string: ");
        // String str=sc.nextLine();
        // String newStr = "";
        // for(int i=0;i<str.length();i++){
        // if(str.charAt(i)=='h'){
        // newStr += 'i';
        // }
        // else{
        // newStr += str.charAt(i);
        // }
        // }
        // System.out.println("New string is: "+ newStr);

        // Input an email from the user. You have to create a username from the email
        // by deleting the part that comes after ‘@’. Display that username to the user

        // System.out.println("Enter your email address: ");
        // String email = sc.nextLine();
        // int index = email.indexOf('@');
        // String userName = email.substring(0, index);
        // System.out.println("UserName is: " + userName);

        // or
        // System.out.println("Enter your email address: ");
        // String email = sc.nextLine();
        // String userName = "";
        // for (int i = 0; i < email.length(); i++) {
        // if (email.charAt(i) == '@') {
        // break;
        // } else {
        // userName += email.charAt(i);
        // }
        // }
        // System.out.println("UserName is: " + userName);

        // reverse a string
        // String str = "abdullah";
        // String revStr = "";
        // for (int i = 0; i < str.length(); i++) {
        // revStr = str.charAt(i) + revStr;
        // }
        // System.out.println("Original string: " + str);
        // System.out.println("Reverse string: " + revStr);

        // count vowels and consonent
        // String str = "abdullah tayyab";
        // int vowel = 0;
        // int consonent = 0;
        // int space = 0;
        // for (int i = 0; i < str.length(); i++) {
        //     if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
        //             || str.charAt(i) == 'u') {
        //         vowel++;
        //     }else if(str.charAt(i) == ' '){
        //         space++;
        //     }
        //      else {
        //         consonent++;
        //     }
        // }
        // System.out.println("Vowel is: " + vowel+" and consonent is: "+consonent+" and space is: "+space);

        // check palindrome 
        // String str = "madam";
        // String revStr = "";
        // for(int i=0;i<str.length();i++){
        //     revStr = str.charAt(i)+revStr;
        // }
        // if(str.compareTo(revStr)==0){
        //     System.out.println("Original string is: "+ str + " and reverse string is: "+ revStr);
        //     System.out.println("Palindrome string.");
        // }
        // else{
        //     System.out.println("Originla string is: "+ str + " and reverse string is: "+ revStr);
        //     System.out.println("Not a Palindrome string.");

        // }

        // count word in sentence 
        // String sentence = "My name is abdullah tayyab";
        // int words = 0;
        // boolean isword = false;
        // for(int i=0;i<sentence.length();i++){
        //     char ch = sentence.charAt(i);
        //     if(ch != ' ' && !isword){
        //         words++;
        //         isword=true;
        //     }
        //     else if(ch == ' '){
        //         isword=false;
        //     }
        // }
        // System.out.println("Total words of this string: "+ sentence+" is: "+words);

        // lower case to upper case 
        String str = "abdullah tayyab";
        String upStr = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                ch= (char)(ch-32);
            }
            upStr = upStr+ ch;
        }
        System.out.println("Uppercase string is: "+ upStr);
    }
}
