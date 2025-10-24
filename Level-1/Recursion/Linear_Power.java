
import java.util.Scanner;

public class Linear_Power{
        public static void main(String[] args){
            Scanner scn=new Scanner(System.in);
            System.out.println("Enter power:");
            
            int n=scn.nextInt();
            int b=scn.nextInt();

            int result=linear_power(b,n);
            System.out.println(result);
        }
        public static int linear_power(int base,int n){
                // base case
                if(n==0){
                        return 1;
                }
                int bpower=linear_power(base,n/2);
                int result=bpower*bpower;
                if(n%2!=0){
                        result=result*2;
                }
               return result;
        }
}