import java.util.*;

public class All_repeating_three_times_except_one{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        int result=solution(arr);
        System.out.println(result);
    }
    public static int solution(int arr[]){
        int ans=0;
        for(int i=0; i<4; i++){
            int sum=0;
            for(int j=0; j<arr.length; j++){
                if((arr[j]&1<<i)==1){
                    sum++;
                }
            }
            if(sum%3!=0){
                ans=ans|(1<<i);
            }
        }
        return ans;
    }
}