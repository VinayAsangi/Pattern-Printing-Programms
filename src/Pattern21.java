//a
//a b
//a b c
//a b c d
//a b c d e
import java.util.Scanner;
public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
}
