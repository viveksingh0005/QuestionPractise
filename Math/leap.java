import java.util.Scanner;
public class leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%100==0&&a%400==0){
            System.out.println("It is leap year");
        }
        else if(a%100!=0&&a%4==0){
            System.out.println("It is leap year");
        }
        else{
            System.out.println("It is not leap year");
        }
    }
}
