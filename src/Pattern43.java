//enter the number:
//        5
//        5 4 3 2 1 2 3 4 5
//          4 3 2 1 2 3 4
//            3 2 1 2 3
//              2 1 2
//                1

import java.util.Scanner;

public class Pattern43 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=sc.nextInt();
        for (int i=n;i>=1;i--){
            for (int j=n;j>i;j--){
                System.out.print("  ");
            }
            for (int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for (int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
