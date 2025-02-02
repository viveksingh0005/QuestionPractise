import java.util.Scanner;
public class SumOfAp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("first number");
    int firstNum=sc.nextInt();
    System.out.println("common difference");
    int commonDifference=sc.nextInt();
    System.out.println("number of terms");
    int numOfTerms=sc.nextInt();
    int sum=0;
    for(int i=1;i<=numOfTerms;i++){
        sum=sum+firstNum;
        firstNum=firstNum+commonDifference;
        
    }
    System.out.println(sum);
    }
}
