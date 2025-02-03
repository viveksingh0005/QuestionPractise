import java.util.Scanner;
public class hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        if (a < b) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    c = i;
                }
            }
        }
       else{
        for(int j=1;j<=b;j++){
            if(a%j==0&&b%j==0){
                c=j;
            }
        }
       
        
       }
       System.out.println(c);
    }
}
