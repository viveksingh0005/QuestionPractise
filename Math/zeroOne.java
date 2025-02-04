import java.util.Scanner;
public class zeroOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String str = String.valueOf(a);
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='0'){
                ch='1';
                
            }
            System.out.print(ch);
        }
    }
}
