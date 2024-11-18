//1 0 1 0 1
//0 1 0 1 0
//1 0 1 0 1
//0 1 0 1 0
//1 0 1 0 1
import java.util.Scanner;
public class Pattern12 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            if(i%2!=0)
                for (int j=1;j<=n;j++){
                System.out.print(j%2+" ");
                }
            else
                for (int j=2;j<=n+1;j++){
                    System.out.print(j%2+" ");
                }
        System.out.println();
        }
    }
}
