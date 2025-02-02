import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int cn=a;
    int tcn=a;
    int c=0;
    int s=1;
    int sum=0;
    while(a!=0){
        a=a/10;
        c++;
    }
   
        
        while(cn!=0){
            int b=cn%10;
            for(int i=1;i<=c;i++){
                s=s*b;
               
               
            }
            
            sum=sum+s;
            s=1;
            cn=cn/10;
        }
      if(sum==tcn){
        System.out.println("number is armstrong");
      }
      else{
        System.out.println("number is not armstrong");
      }
    
  
    }
}
