import java.util.Scanner;
public class gp {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int r=sc.nextInt();
    int n=sc.nextInt();
    int m=1;
    for(int i=1;i<=n;i++){
        m=m*r;

    }
    int x=m-1;
    int y=r-1;
    System.out.println((a*x)/y);
   }
}
