
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Permutation_01{
    public static void main(String[] args){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int items=Integer.parseInt(br.readLine());
        int nbox = Integer.parseInt(br.readLine());
        permutation(new int[nbox],1,items);
    }


    public static void permutation(int []box,int ci, int ti){
        
        if(ci>ti){
            for(int i=0; i<box.length; i++){
                System.out.print(box[i]);
            }
        System.out.println("");
        return;
        }
        
        for(int i=0; i<box.length; i++){
            if(box[i]==0){
                box[i]=ci; 
                permutation(box, ci+1, ti);
                box[i]=0;
            }
        }
    }
}