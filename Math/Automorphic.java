import java.util.Scanner;
public class Automorphic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int ca=a;
        int c=0;
        int y=1;
        int z=1;
        int sum=0;
        int sq=a*a;
        while(a!=0){
            int b=a%10;
            c++;
            a=a/10;
        }
        for(int i=1;i<=c;i++){
            int x=sq%10;
            y=z;
            y=y*x;
            sum=sum+y;
            z=z*10;
            
            sq=sq/10;
        }
       if(sum==ca){
        System.out.println("Number is automorphic ");
       }
       else{
        System.out.println("Number is not automorphic");
       }


    }
}
