
import java.util.Scanner;

public class Fibonacci{
        public static void main(String []args){
                Scanner scn=new Scanner(System.in);
                int n=scn.nextInt();
                int ans3=fib(n);
                System.out.println(ans3);
        }
        
        public static int fib(int n){
            
                int []dp=new int[n];
                for(int i=0; i<n; i++){
                        dp[i]=(-1);
                }
                int ans2=recu_memo(n,dp);
                return ans2;
        }
        
        public static int recu_memo(int n, int []dp){
                if(n<=1){
                        return dp[n]=n;
                }

                if(dp[n]!=(-1)){
                        return dp[n];
                }

                int ans=recu_memo(n-1,dp)+recu_memo(n-2,dp);
                return dp[n]=ans;
        }
}