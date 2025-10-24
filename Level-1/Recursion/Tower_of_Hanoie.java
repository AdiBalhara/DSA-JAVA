
import java.util.Scanner;

public class Tower_of_Hanoie{
        public static void main(String[] args){
                Scanner scn=new Scanner(System.in);
                int n=scn.nextInt();
                int t1=scn.nextInt();
                int t2=scn.nextInt();
                int t3=scn.nextInt();
                tower_of_hanoie(n,t1,t2,t3);
        }

        public static void tower_of_hanoie(int n,int t1,int t2,int t3){
                if (n==0){
                return;
                }
                tower_of_hanoie(n-1,t1,t2,t3);
                System.out.println(n+"[" +t1+ "->" +t2+ "]");
                tower_of_hanoie(n-1,t3,t2,t1);
        }
}