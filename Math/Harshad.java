import java.util.Scanner;
class Harshad{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int ca=a;
        int s=0;
        while(a!=0){
            int b=a%10;
            s=s+b;
            a=a/10;
        }
        if(ca%s==0){
            System.out.println("It is Harshad Number");
        }
        else{
            System.out.println("It is not Harshad Number");
        }

    }
}