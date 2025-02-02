import java.util.Scanner;
public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<0){
            System.out.println("number is negative");
        }
        else if(a==0){
            System.out.println("number is zero");
        }

        else{
            System.out.println("number is positive");
        }

    }
}
