import java.util.Scanner;

public class digitSum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s=0;
        while(a!=0){
            int b=a%10;
            s=s+b;
            a=a/10;
        }
        System.out.println("sum= "+s);
    }
}