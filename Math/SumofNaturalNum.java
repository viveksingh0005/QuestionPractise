import java.util.Scanner;
public class SumofNaturalNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=0;
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            s=s+i;
        }
        System.out.println(s);
    }
}
