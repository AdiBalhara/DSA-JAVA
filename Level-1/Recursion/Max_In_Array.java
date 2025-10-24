
import java.util.Scanner;

public class Max_In_Array{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        
        int n= scn.nextInt();
        int []arr=new int[n];

        for(int i=0; i<n; i++){
             arr[i]=scn.nextInt();
        }
        int result=max_element(arr,0);
        System.out.println(result);
    }
    public static int max_element(int []arr,int idx){
        
        if(idx==arr.length-1){
            return arr[idx];
        }
        int result=max_element(arr,idx+1);

        return Math.max(arr[idx],result);
    }
}