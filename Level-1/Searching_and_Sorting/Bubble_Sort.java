
import java.util.Scanner;

public class Bubble_Sort{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];

        for(int i=0; i<n ;i++){
            arr[i]=scn.nextInt();
        }

        for(int itr=1; itr<=n-1; itr++){
            for(int i=0; i<n; i++){
                if(isSmaller(i+1,i,arr)==true){
                    Swap(i+1,i,arr);
                }
            }
        }
        System.out.println(arr);
    }
    public static boolean isSmaller(int i, int j, int arr[]){
        if(arr[i+1]<arr[i]){
            return true;
        }
        else{
            return false;
        }
    }
    public static void Swap(int i, int j, int arr[]){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}