import java.util.Scanner;

public class Selection_Sort{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        selection_sort(arr);
    }
    public static void selection_sort(int []arr){
        for(int i=0; i<arr.length-1; i++){
            int minidx=i;
            for(int j=i+1; j<arr.length; j++){
                if(isSmaller(j,minidx,arr)==true){
                    minidx=j;
                }
            }
            Swap(i, minidx, arr);
        }
    }
    public static void Swap(int i, int j, int arr[]){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }    
    public static boolean isSmaller(int i, int j, int arr[]){
        if(arr[i+1]<arr[i]){
            return true;
        }
        else{
            return false;
        }
    }
}
