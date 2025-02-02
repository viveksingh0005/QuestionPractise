import java.util.Scanner;
public class primeinRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            if(isprime(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isprime(int n){
        
        for(int j=2;j<n;j++){
            if(n%j==0){
                return false;
            }
          
        }
        return true;
    }
}
