import java.util.Scanner;
public class lcm {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int hcf=1;
        if(a<b){
            for(int i=1;i<=a;i++){
                if(a%i==0&&b%i==0){
                    hcf=i;
                }
            }
        }
        else{
            for(int j=1;j<=b;j++){
                if(a%j==0&&b%j==0){
                    hcf=j;
                }
            }
        }
        int p=a*b;
        int lcm=p/hcf;
        System.out.println("lcm  = "+lcm);
    }
}
