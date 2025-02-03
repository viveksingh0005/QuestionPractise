import java.util.Scanner;
public class StrongNum {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int ca=a;
        int s=0;
        while(a!=0){
            int b=a%10;
            s=s+factorial(b);

            a=a/10;
        }
        if(s==ca){
            System.out.println("Number is strong");
        }
        else{
            System.out.println("number is not strong");
        }
    }
    static int factorial(int b){
        int f=1;
        for(int i=1;i<=b;i++){
            f=f*i;
        }
        
        return f;
    }
}
