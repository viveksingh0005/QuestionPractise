import  java.util.Scanner;
public class fractionSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int na=sc.nextInt();
        int da=sc.nextInt();
        int hcf=1;
        int nb=sc.nextInt();
        int db=sc.nextInt();
        if (db<da){
            for(int i=1;i<=db;i++){
                if(da%i==0&&db%i==0){
                    hcf=i;
                }
            }
        }
        else{
            for(int j=1;j<=da;j++){
                if(da%j==0&&db%j==0){
                    hcf=j;
                }
            }
        }
        System.out.println(hcf);
        int p=da*db;

        int lcm=p/hcf;
        int d1=lcm/da;
        int d2=lcm/db;
        int s1=d1*na;
        int s2=d2*nb;
        int sum=s1+s2;
        System.out.println(sum+"/"+lcm);
    }
}

