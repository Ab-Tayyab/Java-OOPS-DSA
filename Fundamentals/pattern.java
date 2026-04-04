public class pattern {
    public static void main(String args[]){
        // solid rectangle 

        // for(int i=0;i<5;i++){
        //     for(int j=0;j<=5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // hollow rectangle 

        // int n=5;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i==0 || i==n-1 || j==0 || j==n-1){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // half pyramid 

        // for(int i=0;i<5;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // inverted half pyramid 

        // for(int i=0;i<5;i++){
        //     for(int j=5-1;j>=i;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // inverted half pyramid rotate by 180 deg

        for(int i=0;i<5;i++){
            for(int k=5-1;k>i;k--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
