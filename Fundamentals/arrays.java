import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(Strings args[]) {

        // first method of array declare

        // int [] marks = new int[3];
        // marks[0]=10;
        // marks[1]=10;
        // marks[2]=10;

        // for(int i=0;i<3;i++){
        // System.out.println(marks[i]);
        // }

        // second method of array declare

        // int number []={1,2,3,4,5};
        // for(int i=0;i<5;i++){
        // System.out.println(number[i]);
        // }

        // user input size and value

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of array: ");
        // int size = sc.nextInt();
        // int value [] = new int[size];
        // System.out.println("Input");
        // for(int i=0;i<size;i++){
        // System.out.println("Enter "+ i + " index Number: ");
        // int in = sc.nextInt();
        // value[i]= in;
        // }
        // System.out.println("Output");
        // for(int i=0;i<size;i++){
        // System.out.println(value[i]);
        // }

        // input from user and search number in an array

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of array: ");
        // int size = sc.nextInt();
        // int value[] = new int[size];
        // System.out.println("Input");
        // for (int i = 0; i < size; i++) {
        //     System.out.println("Enter " + i + " index Number: ");
        //     int in = sc.nextInt();
        //     value[i] = in;
        // }
        // System.out.println("Enter the number which you want to search: ");
        // int num = sc.nextInt();
        // for (int i = 0; i < value.length; i++) {
        //     if (num == value[i]) {
        //         System.out.println("Number found at index : " + i);
        //     }
        // }

        // int numbers [] = {9,3,2,4,5,3,4};
        // int min=numbers[0];
        // int max=numbers[0];
        // for(int i=0;i<numbers.length;i++){

        //     if(numbers[i]<min){
        //         min = numbers[i];

        //     }
        //     if(numbers[i]>max){
        //         max = numbers[i];
        //     }
        // }
        // System.out.println("Min is: "+ min + " and max is: "+ max);

        // second is built in function 

        // Arrays.sort(numbers);
        // System.out.println(numbers[0]);
        // System.out.println(numbers[numbers.length-1]);


        // check ascending or decending order of array 

        int numbers[] = {1,2,3,4,5};
        boolean isAscending = true;
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]>numbers[i+1]){
                isAscending=false;
            }
        }
        if(isAscending==true){
            System.out.println("ascending order array:");
        }
        else{
System.out.println("Decending order array:");
        }
    }
}
