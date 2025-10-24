
import java.util.*;

public class Print_Subsequence_1{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        ArrayList<String> result=Subsequence(str);
        System.out.println(result);
    }
    public static ArrayList Subsequence(String str){
        if(str.length()==0){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);

        ArrayList<String> rr=Subsequence(ros);

        ArrayList<String> myans=new ArrayList<>();
        //Exclude
        for(int i=0; i<rr.size(); i++){
            myans.add(rr.get(i));
        }
        for(int i=0; i<rr.size(); i++){
            myans.add(rr.get(i));
        }
        return myans;
    }
}