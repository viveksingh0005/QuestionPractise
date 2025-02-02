import java.util.Scanner;
public class perfect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=a;
        int s=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                s=s+i;
            }
        }
        if(s==c){
            System.out.println("number is perfect");
        }
        else{
            System.out.println("number is not perfect");
        }

    }
}
