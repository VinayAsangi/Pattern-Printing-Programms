//Enter the number:
//        5
//            *
//          *   *
//        *       *
//          *   *
//            *

import java.util.Scanner;
public class Pattern48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int star=1,space=n/2;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=star;j++){
                if(j==1||j==star)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            if(i<=n/2){
                star=star+2;
                space--;
            }
            else {
                star=star-2;
                space++;
            }
            System.out.println();
        }
    }
}
