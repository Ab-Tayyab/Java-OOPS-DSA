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
        //     for (int j = 1; j <= i; j++) {
        //         if (j == 1 || j == i) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     for (int k = 1; k <= 2 * (n - i); k++) {
        //         System.out.print(" ");
        //     }
        //     for (int l = 1; l <= i; l++) {
        //         if (l == 1 || l == i) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        // // lower half
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         if (j == 1 || j == i) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     for (int k = 1; k <= 2 * (n - i); k++) {
        //         System.out.print(" ");
        //     }
        //     for (int l = 1; l <= i; l++) {
        //         if (l == 1 || l == i) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // hollow rhombus pattern

        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 5; j >= i; j--) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 1; k <=5; k++) {
        //         if(i==1 || i==5 || k==1 || k==5){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // half pyramid 

        // for(int i=1;i<=5;i++){
        //     for(int j=5;j>=i;j--){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i;k++){
        //         System.out.print(k+" ");
        //     }
        //     System.out.println();
        // }

          // inverted half pyramid 

        // for(int i=5;i>=1;i--){
        //     for(int j=5;j>=i;j--){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i;k++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        // pascal pyramid pattern 

        int n=5;
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int num=1;
            for(int k=0;k<=i;k++){
                System.out.print(num+ " ");
              num = num*(i-k)/(k+1);
            }
            System.out.println();
        }
    }
}
