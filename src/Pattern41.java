import java.util.Scanner;

public class Pattern41 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=sc.nextInt();
        for (int i=n;i>=1;i--){
            for (int j=n;j>i;j--){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print((char)(j+96)+" ");
            }
            for (int j=i-1;j>=1;j--){
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
}
