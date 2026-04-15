public class operatorsAndBinaryNumberSystem {
    public static void main(String args[]) {
        // arithmetic operation
        // binary operator
        int sum = 2 + 5;
        int subtraction = 5 - 2;
        int multiplication = 2 * 2;
        int divide = 5 / 2;
        int modulus = 5 % 2;
        System.out.println("Sum: " + sum + ", Subtraction: " + subtraction + ", Divide: " + divide
                + ", multiplication: " + multiplication + ", modulus: " + modulus);
        // uninary operaor
        int incre = 10;
        int decre = 10;
        // post increment and post decrement, first assing value then increment or
        // decrement
        int a = incre++;
        int b = decre--;
        System.out.println("post increment: " + (a) + ", post decrement: " + (b));
        // pre increment and pre decrement, first increment or decrement then assign
        // value
        int preincre = 10;
        int predecre = 10;
        int c = ++preincre;
        int d = --predecre;
        System.out.println("pre increment: " + (c) + ", pre decrement: " + (d));


        // relational operator 
        System.out.println("equal to: "+ (10==10));
        System.out.println("less then: "+ (9<10));
        System.out.println("greaer then: "+ (10>8));
        System.out.println("less the and equal to: "+ (10<=10));
        System.out.println("greater then and equal to: "+ (10>=10));
        System.out.println("Not equal to: "+ (10!=10));

        // logical operator 
        int num1=10;
        int num2=20;
        int num3=30;
         System.out.println("AND operator: " + (num1<num2 && num2>num3));
         System.out.println("OR operator: "+(num1<num2 || num2>num3));
         System.out.println("NOT operator: "+!(num2>num3));

        //  assignment operator 
        int value1 = 10;
        int value2;
        value2=value1;
        System.out.println("Assign value: "+ value2);
        System.out.println("Self Addition: "+ (value1 += value1));
        System.out.println("Self subtraction: "+ (value1 -= value1));
        System.out.println("Self multiplication: "+ (value2 *= value2));
        System.out.println("Self division: "+ (value2 /= value2));

    }
}
