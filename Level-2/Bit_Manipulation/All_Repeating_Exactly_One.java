import java.util.*;

public class All_Repeating_Exactly_One{
    public static void main(String [] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        solution(arr);
    }
    public static void solution(int arr[]){
        int xor=0;

        for(int i=0; i<arr.length; i++){
            xor^=arr[i];
       }

       System.out.println(xor);
    }
}