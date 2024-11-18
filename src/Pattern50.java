import java.util.Scanner;
public class Pattern50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int star=n,space=0;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=space;j++){
                System.out.print("  ");
            }
            int x=1;
            for (int j=1;j<=star;j++){
                System.out.print(x+" ");
                if (j<=star/2)
                    x++;
                else
                    x--;
            }
            if(i<=n/2){
                star=star-2;
                space++;
            }
            else {
                star=star+2;
                space--;
            }
            System.out.println();
        }
    }
}

