import java.util.Scanner;

public class Display_Array_Reverse{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        
        int n= scn.nextInt();
        int []arr=new int[n];

        for(int i=0; i<n; i++){
             arr[i]=scn.nextInt();
        }
        display_array(arr,0);
    }
    
    public static void display_array(int []arr,int idx){
        if(idx==arr.length){
            return ;
        }
        display_array(arr,idx+1);
        System.out.println(arr[idx]);
        
    
    }
}