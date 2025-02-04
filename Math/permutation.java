import java.util.Scanner;
public class permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int seats=sc.nextInt();
        int permutation=1;
        for(int i=1;i<=seats;i++){
            permutation=permutation*num;
            num--;
        }
        System.out.println(permutation);
    }
}
