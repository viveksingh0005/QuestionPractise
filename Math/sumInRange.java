import java.util.Scanner;
public class sumInRange {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int s=0;
        for(int i=a;i<=b;i++){
            s=s+i;
        }
        System.out.println(s);
    }
}
