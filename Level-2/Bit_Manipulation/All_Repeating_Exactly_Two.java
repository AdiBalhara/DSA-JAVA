
import java.util.Scanner;

public class All_Repeating_Exactly_Two{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        solution(arr);
    }
    public static void solution(int []arr){
        int xor=0;
        for(int i=0; i<arr.length; i++){
            xor^=arr[i];
        }
        
        int rsb=xor&(-xor);

        int n1=0;
        int n2=0;

        for(int i=0; i<arr.length; i++){
            if((arr[i]&rsb)==1){
                n1^=arr[i];
            }
            else{
                n2^=arr[i];
            }
        }
        if(n1>n2){
            System.out.println(n2);
            System.out.println(n1);
        }
        else{
            System.out.println(n1);
            System.out.println(n2);
        }
    }
}