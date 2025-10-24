import java.awt.ItemSelectable;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Permutation_02{
    public static void main(String[] args){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int nbox=Integer.parseInt(br.readLine());
        int items=Integer.parseInt(br.readLine());
        solution(1, nbox, new int[items], 0, 2, "");
    }
    public static void solution(int cb, int tb, int[] items, int ssf, int ts, String asf){
        
        //YES call
        for(int i=0; i<items.length; i++){
            if(items[i]==0){
                items[i]=cb;
                solution(cb+1, tb, items, ssf+1, ts, asf+"i");
                items[i]=0;
            }    
        }
        //NO call
        solution(cb, tb, items, ssf+1, ts, asf+" ");
    } 
}