import java.util.Scanner;
public class factors2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    System.out.print(i+" factorial is "+j+"   " );
                }
                
            }
            System.out.println();
        }
    }
}
    
