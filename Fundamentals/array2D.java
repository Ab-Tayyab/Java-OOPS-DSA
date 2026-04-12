import java.util.Scanner;

public class array2D {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number of rows: ");
        // int row = sc.nextInt();
        // System.out.println("Enter number of column: ");
        // int col = sc.nextInt();
        // int [][] number = new int [row][col];

        // for(int i=0;i<row;i++){
        // for(int j=0;j<col;j++){
        // System.out.print("Enter number for: Row "+ i+" Col "+j+" : ");
        // int in = sc.nextInt();
        // number[i][j]=in;
        // }
        // }

        // System.out.println("Output: ");
        // for(int i=0;i<row;i++){
        // for(int j=0;j<col;j++){
        // System.out.print(number[i][j] + " ");
        // }
        // System.out.println();
        // }

        // search number for 2D array

        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("Input:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter value for row " + i + " and column " + j + " : ");
                int num = sc.nextInt();
                matrix[i][j] = num;
            }
        }
        System.out.println("Output");
        System.out.print("Enter number which want you to search: ");
        int search = sc.nextInt();

        boolean isFound = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (search == matrix[i][j]) {
                    System.out.println(search + " number is found at :" + i + "," + j + " index.");
                    isFound = true;
                }
            }
        }
        if (!isFound) {
            System.out.println("Not found!");
        }

    }
}
