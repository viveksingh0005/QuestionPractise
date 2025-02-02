import java.util.Scanner;
class palindrome {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=a;
        int s=0;
        while(a!=0){
            int b=a%10;
            s=s*10+b;
            a=a/10;
        }
       if(s==c){
        System.out.println("number is palindrome");
       }
       else{
        System.out.println("numberr is  not palindrome");
       }

    }
}