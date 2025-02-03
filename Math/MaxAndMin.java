import java.util.Scanner;

public class MaxAndMin {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int min=9;
        int max=0;
        while(a!=0){
            int b=a%10;
            if(max<b){
                max=b;
            }
             if(min>b){
                min=b;
            }
            a=a/10;
        }
        System.out.println("Max value=" +max);
        System.out.println("Min value=" +min);
        
    }
}
