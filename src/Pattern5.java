//1 0 1 0 1
//1 0 1 0 1
//1 0 1 0 1
//1 0 1 0 1
//1 0 1 0 1
import java.util.Scanner;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(j%2+" ");
            }
            System.out.println();
        }
    }
}
