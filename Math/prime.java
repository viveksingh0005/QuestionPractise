import java.util.Scanner;
public class prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int x=0;
    for(int i=2;i<a;i++){
        if(i%a==0){
            x=1;
        }
    }
    if(x==1){
        System.out.println("number is prime");
    }
    else{
        System.out.println("number is not prime");
    }
    }
    
}
