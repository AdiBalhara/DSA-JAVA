import java.util.*;

public class Insertion_Sort{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        insertion_sort(arr);
    }
    public static void insertion_sort(int []arr){
        for(int i=1; i<arr.length; i++){
            for(int j=i; j>0; j--){
                if(isGreater(j,j-1,arr)==true){
                    swap(j,j-1,arr);
                }
                else{
                    break;
                }
            }
        }
        for(int k=0; k<arr.length; k++){
            System.out.println(arr[k]);
        }
    }
    public static boolean isGreater(int j, int i, int arr[]){
        if(arr[j]<arr[j-1]){
            return true;
        }
        else {
            return false;
        }
    }
    public static void swap(int j, int i, int arr[]){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
