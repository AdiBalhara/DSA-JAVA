
import java.util.Scanner;

public class Climbing_Stairs{
        public static void main(String[] args)throws Exception{
                Scanner scn=new Scanner(System.in);
                int n=scn.nextInt();
                int []dp=new int[n+1];
                int ans=cs_rec(n, dp);
                int ans2=cs_memo(n,dp);
                int ans3=cs_tab(n,dp);
        }

        public static int cs_memo(int n, int []dp){
                if (n<0) {
                    return 0;
                }
                if (n==1){
                        return 1;
                }
                if(dp[n]>0){
                        return dp[n];
                }
                int ans=cs_memo(n-1,dp)+cs_memo(n-2,dp)+cs_memo(n-3,dp);
                return dp[n]=ans;
        }

        public static int cs_rec(int n, int []dp){
                if (n<0) {
                    return 0;
                }
                if (n==1){
                        return 1;
                }
                
                int ans=cs_rec(n-1,dp)+cs_rec(n-2,dp)+cs_rec(n-3,dp);

                return ans;
        }

        public static int cs_tab(int n, int []dp){
                dp[0]=1;
                for(int i=1; i<=n;i++){
                        if(i==1){
                                dp[i]=dp[i-1];
                        }else if(i==2){
                                dp[i]=dp[i-1]+dp[i-2];
                        }else{
                                dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
                        }
                        //dp[i]=(i-1>=0?dp[i-1]:0)+(i-2>=0?dp[i-2]:0)+(i-3>=0?dp[i-3]:0);
                }
                return dp[n];
        }

}