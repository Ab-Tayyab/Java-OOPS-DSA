public class pattern {
    public static void main(String args[]) {
        // solid rectangle

        // for(int i=0;i<5;i++){
        // for(int j=0;j<=5;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // hollow rectangle

        // int n=5;
        // for(int i=0;i<n;i++){
        // for(int j=0;j<n;j++){
        // if(i==0 || i==n-1 || j==0 || j==n-1){
        // System.out.print("*");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // half pyramid

        // for(int i=0;i<5;i++){
        // for(int j=0;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // inverted half pyramid

        // for(int i=0;i<5;i++){
        // for(int j=5-1;j>=i;j--){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // inverted half pyramid rotate by 180 deg

        // for(int i=0;i<5;i++){
        // for(int k=5-1;k>i;k--){
        // System.out.print(" ");
        // }
        // for(int j=0;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // half pyramid with number

        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // inverted half pyramid with number 

        //  for (int i = 1; i <= 5; i++) {
        //     for (int j = 5; j >= i; j--) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // floyd's triangle pattern 

        // int num=1;
        //  for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         if(i==5){
        //         System.out.print(num +" ");
        //         }
        //         else{
        //             System.out.print(num +"  ");
        //         }
        //         num++;
        //     }
        //     System.out.println();
        // }

        // 0-1 pattern 

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                int sum = i+j;
                if(sum%2==0){
                    System.out.print(1 + " ");
                }
                else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
