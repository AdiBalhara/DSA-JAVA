import java.util.*;

public class Sliding_Window{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Size of array:");
        int n=scn.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the size of window:");
        int k=scn.nextInt();

        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0; i<k; i++){
            while(dq.size()>0 && arr[dq.getLast()]<arr[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.println(arr[dq.peek()]);

        // For rest of the window 
        for (int i=k; i<n; i++){
            while(dq.size()>0 && arr[dq.getLast()]<arr[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        
        if(dq.peek()<i-k){
            dq.removeFirst();
        }
        }
        System.out.println(dq.getFirst());
    }
    
}