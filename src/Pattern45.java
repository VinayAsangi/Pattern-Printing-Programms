//Enter the Number:5
//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15

import java.util.Scanner;
public class Pattern45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int x=i;
            for (int j=1;j<=i;j++){
                System.out.print(x+" ");
                x=x+n-j;
            }
            System.out.println();
        }
    }
}
