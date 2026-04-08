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
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // inverted half pyramid with number

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 5; j >= i; j--) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // floyd's triangle pattern

        // int num=1;
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // if(i==5){
        // System.out.print(num +" ");
        // }
        // else{
        // System.out.print(num +" ");
        // }
        // num++;
        // }
        // System.out.println();
        // }

        // 0-1 pattern

        // for(int i=1;i<=5;i++){
        // for(int j=1;j<=i;j++){
        // int sum = i+j;
        // if(sum%2==0){
        // System.out.print(1 + " ");
        // }
        // else{
        // System.out.print(0 + " ");
        // }
        // }
        // System.out.println();
        // }

        // butterfly pattern

        // for (int i = 1; i < 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int k = 1; k <= 2 * (5 - i); k++) {
        // System.out.print(" ");
        // }
        // for (int l = 1; l <= i; l++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = 5; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int k = 1; k <= 2 * (5 - i); k++) {
        // System.out.print(" ");
        // }
        // for (int l = 1; l <= i; l++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // solid rhombus

        // for (int i = 0; i < 5; i++) {
        // for (int j = 5; j > i; j--) {
        // System.out.print(" ");
        // }
        // for (int k = 0; k < 5; k++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // number pyramid

        // int n = 1;
        // for (int i = 1; i <= 5; i++) {
        // for(int j=5-i;j>0;j--){
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= i; k++) {
        // System.out.print(n + " ");
        // }
        // n += 1;
        // System.out.println();
        // }

        // palindromic number pattern

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 5 - i; j > 0; j--) {
        // System.out.print(" ");
        // }

        // for (int k = i; k >= 1; k--) {
        // System.out.print(k + " ");
        // }
        // for (int k = 2; k <= i; k++) {
        // System.out.print(k + " ");
        // }
        // System.out.println();
        // }

        // diamond pattern

        // upper half
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 5 - i; j > 0; j--) {
        // System.out.print(" ");
        // }

        // for (int k = i; k >= 1; k--) {
        // System.out.print("*");
        // }
        // for (int k = 2; k <= i; k++) {
        // System.out.print( "*");
        // }
        // System.out.println();
        // }
        // lower half
        // for (int i = 4; i >=1; i--) {
        // for (int j = 5 - i; j > 0; j--) {
        // System.out.print(" ");
        // }

        // for (int k = i; k >= 1; k--) {
        // System.out.print("*");
        // }
        // for (int k = 2; k <= i; k++) {
        // System.out.print( "*");
        // }
        // System.out.println();
        // }

        // hollow diamond pattern

        // int n = 5;
        // upper half
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // if (j == 1 || j == i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // for (int k = 1; k <= 2 * (n - i); k++) {
        // System.out.print(" ");
        // }
        // for (int l = 1; l <= i; l++) {
        // if (l == 1 || l == i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        // // lower half
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // if (j == 1 || j == i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // for (int k = 1; k <= 2 * (n - i); k++) {
        // System.out.print(" ");
        // }
        // for (int l = 1; l <= i; l++) {
        // if (l == 1 || l == i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // hollow rhombus pattern

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 5; j >= i; j--) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <=5; k++) {
        // if(i==1 || i==5 || k==1 || k==5){
        // System.out.print("*");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // half pyramid

        // for(int i=1;i<=5;i++){
        // for(int j=5;j>=i;j--){
        // System.out.print(" ");
        // }
        // for(int k=1;k<=i;k++){
        // System.out.print(k+" ");
        // }
        // System.out.println();
        // }

        // inverted half pyramid

        // for(int i=5;i>=1;i--){
        // for(int j=5;j>=i;j--){
        // System.out.print(" ");
        // }
        // for(int k=1;k<=i;k++){
        // System.out.print(i+" ");
        // }
        // System.out.println();
        // }

        // pascal pyramid pattern

        // int n=5;
        // for(int i=0;i<n;i++){
        // for(int j=1;j<=n-i;j++){
        // System.out.print(" ");
        // }
        // int num=1;
        // for(int k=0;k<=i;k++){
        // System.out.print(num+ " ");
        // num = num*(i-k)/(k+1);
        // }
        // System.out.println();
        // }

        // Sandglass Pattern

        // int n = 5;
        // for (int i = n; i >=1; i--) {
        // for (int k = 1; k <=n-i; k++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <=i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = 2; i <=n; i++) {
        // for (int k = 1; k <=n-i; k++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <=i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // pyramid with star and number mix

        // int num=1;
        // for (int i = 1; i <= 5; i++) {
        //         for (int j = 1; j <= num; j++) {
        //             if(j==i){
        //                 System.out.print(j);
        //             }
        //             else{
        //                 System.out.print("*");
        //         }
        //     }
        //     num+=2;
        //     System.out.println();
        // }

        // staircase pattern 

        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         if(j==1 || i==n || j==i){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // binary number square
        
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         if((i+j)%2==0){
        //             System.out.print(1);
        //         }
        //         else{
        //             System.out.print(0);
        //         }
        //     }
        //     System.out.println();
        // }

        // concentric square pattern 

        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //        int min = Math.min(Math.min(i,j),Math.min(n-i+1,n-j+1));
        //        System.out.print(5-min+1);
        //     }
        //     System.out.println();
        // }

        // number square pattern 

        // for(int i=1;i<=5;i++){
        //     int num =i;
        //     for(int j=1;j<=5;j++){
        //             System.out.print(num + " ");
        //             num++;
        //             if(num>5){
        //                 num =1;
        //             }
        //     }
        //     System.out.println();
        // }

        // spiral pattern 

        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i%2!=0 && !(i==3 && j==4)){
        //             System.out.print("*");
        //         }
        //         else{
        //             if(j==n || (i==4 && j==1)){
        //                 System.out.print("*");
        //             }
        //             else if(i==3 && j==4){
        //                 System.out.print(" ");
        //             }
        //             else{
        //                 System.out.print(" ");
        //             }
        //         }
        //     }
        //     System.out.println();
        // }

        // checkboard pattern 

        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i%2==0 && j==1){
        //             System.out.print(" *");
        //         }
        //         else{
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }

        // square with diagonal 

        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i==2 && j==(n/2+1) || i==4 && j==(n/2+1) || i==3 && j==2 || i==3 && j==4){
        //             System.out.print(" ");
        //         }
        //         else{
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }

        // hourglass pattern 

        // int n=3;
        // int col=5;
        // // upper half 
        // for(int i=1;i<=n;i++){
        //     for(int k=n;k>=n-i;k--){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=col;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     col -=2;
        //     System.out.println();
        // }
        // // lower half 

        // int lcol=3;
        //  for(int i=2;i<=n;i++){
        //     for(int k=n;k>=i-1;k--){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=lcol;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     lcol +=2;
        //     System.out.println();
        // }

        // hollow pyramid 

        // int n=5;
        // int col=1;
        // for(int i=1;i<=n;i++){
        //     for(int k=n;k>=i;k--){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=col;j++)
        //     {
        //         if(i==n || j==1 || j==col){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     col+=2;
        //     System.out.println();
        // }

        // plus pattern 

        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(j==(n/2)+1 || i==(n/2)+1){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

         // plus pattern 

        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i==j || j==n-i+1 || i==n-j+1){
        //             System.out.print("*" );
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
          
        //     System.out.println();
        // }

        // zig zag pattern 

        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i==j || j==n-i+1 || i==n-j+1){
        //             System.out.print("*" );
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     for(int j=2;j<=n;j++){
        //         if(i==j || j==n-i+1 || i==n-j+1){
        //             System.out.print("*" );
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // charcter pyramid 

        for(int i=1;i<=5;i++){
            for(int k=5;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((char)('A'+ j-1));
            }
             for(int j=i-1;j>=1;j--){
                System.out.print((char)('A'+ j-1));
            }
            System.out.println();
        }
    }
}
