import java.util.*;

public class conditionalStatements {
    public static void main(Strings args[]) {
        Scanner sc = new Scanner(System.in);

        // even or odd

        // System.out.println("enter number: ");
        // int num = sc.nextInt();
        // if(num%2==0){
        // System.out.println("Not an odd number");
        // }
        // else{
        // System.out.println("Odd number");
        // }

        // calculator

        System.out.println("Enter First number");
        int fn = sc.nextInt();
        System.out.println("Enter Second number");
        int sn = sc.nextInt();
        System.out.println("1 for +, 2 for -, 3 for *, 4 for /, 5 for %: ");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Addition is = " + (fn + sn));
                break;
            case 2:
                System.out.println("Subtraction is = " + (fn - sn));
                break;
            case 3:
                System.out.println("Multiplication is = " + (fn * sn));
                break;
            case 4:
                if (sn == 0) {
                    System.out.println("Invalid division");
                } else {
                    System.out.println("Division is = " + (fn / sn));
                    break;
                }
            case 5:
                if (sn == 0) {
                    System.out.println("Invalid division");
                } else {
                    System.out.println("Modlus is = " + (fn % sn));
                    break;
                }
            default:
                System.out.println("Invalid number!");
                break;

        }

        // display month name

        // System.out.println("Enter month number");
        // int num = sc.nextInt();
        // switch (num) {
        // case 1: System.out.println("January");break;
        // case 2: System.out.println("Fabuary");break;
        // case 3: System.out.println("March");break;
        // case 4: System.out.println("April");break;
        // case 5: System.out.println("May");break;
        // case 6: System.out.println("June");break;
        // case 7: System.out.println("July");break;
        // case 8: System.out.println("August");break;
        // case 9: System.out.println("September");break;
        // case 10: System.out.println("October");break;
        // case 11: System.out.println("November");break;
        // case 12: System.out.println("December");break;
        // default:System.out.println("Invalid Number");
        // }
    }
}
