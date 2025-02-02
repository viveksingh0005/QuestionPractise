import java.util.Scanner;
class palindrome1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            if(isPalindrome(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isPalindrome(int n){
        int s=0;
        int cn=n;
        while(n!=0){
            int a=n%10;
            s=s*10+a;
            n=n/10;
        }
        if(s==cn){
            return true;
        }
       else{
        return false;
       }
    }
}