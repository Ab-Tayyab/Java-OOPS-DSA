import java.util.Scanner;

public class bitManipulation {
    public static void main(String args[]) {
        // bit wise operator 
        //==>  Binary AND = &, Binary OR = |, Binary XOR = ^, Binary right shift = <<, Binary left shift = >>, Binary one compliment = ~
        // get the 3rd bit at position = 2 of number n=0101
        // two operation perform in get bit manipulation
        // 1- 1<<pos, pos 0 to 1 from right to left
        // 2- & operation perform

        int getNum = 5; // 0101
        int getPos = 2;
        int getBitMask = 1 << getPos;
        if ((getBitMask & getNum) == 0) {
            System.out.println("Bit was zero");
        } else {
            System.out.println("Bit was one");
        }

        // set the 2nd bit at position = 1 of number n=0101 
        // two operation perform in set bit manipulation
        // 1- 1<<pos, pos 0 to 1 from right to left
        // 2- | operation perform

        int setNum = 5; // 0101
        int setPos = 1;
        int setBitMask = 1 << setPos;
        int setNewNumber = setBitMask | setNum;
        System.out.println("New number is: " + setNewNumber);

        // clear the 3rd bit at position=2 of a number n=0101
        // two operation perform in clear bit manipulation
        // 1 - 1<<pos, pos 0 to 1 from right to left
        // 2 - AND with Not , calculate not by using ~ and then use AND

        int clearNum = 5; // 0101
        int clearPos = 2;
        int clearBitMask = 1 << clearPos;
        int clearNotBitMask = ~(clearBitMask);
        int clearNewNumber = clearNotBitMask & clearNum;
        System.out.println("New number is: " + clearNewNumber);

        // update 2nd bit at position = 1 of number n to 1 n=0101
        // two operation perform in update bitManipulation
        // 1 - 1<<pos, pos 0 to 1 from right to left
        // 2 - for 1 AND with Not (1 to 0) , for 0 OR (0 to 1)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for (0 to 1) conversion, and enter 0 for (1 to 0) conversion: ");
        int choice = sc.nextInt();
        int updateNum = 5; // 0101
        int updatePos = 1;
        int updateBitMask = 1 << updatePos;
        if (choice == 1) {
            int updateNewNumber = updateBitMask | updateNum;
            System.out.println("New Number is: " + updateNewNumber);
        } else if (choice == 0) {
            int updateNotBitMask = ~(updateBitMask);
            int updateNewNumber = updateNotBitMask & updateNum;
            System.out.println("New Number is: " + updateNewNumber);
        }
        else{
            System.out.println("Invalid choice:");
        }

    }
}
