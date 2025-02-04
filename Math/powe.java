import java.util.Scanner;
public class powe {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int pow=sc.nextInt();
    int num=sc.nextInt();
    int result=1;
    for(int i=1;i<=pow;i++){
        result=result*num;
    }
    System.out.println(result);
   }
}
