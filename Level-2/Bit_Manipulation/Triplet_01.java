
import java.util.Scanner;

public class Triplet_01{
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
        int count=0;

        for(int i=0; i<arr.length; i++){
            int xor=arr[i];
            for(int k=i+1; k<arr.length; k++){
                xor^=arr[k];
                if(xor==0){
                count=count+(k-i);
                }
            }
        }
        return count;
    }
}