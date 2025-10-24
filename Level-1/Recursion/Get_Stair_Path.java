import java.util.*;

public class Get_Stair_Path{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<String> result=Stair_path(n);
        System.out.println(result);
    }
    public static ArrayList Stair_path(int n){
        //positive base case
        if(n==0){
            ArrayList<String> base_1= new ArrayList<>(); 
            base_1.add("");
            return base_1;
        }

        //negative base case
        if(n<0){
            ArrayList<String> base_2= new ArrayList<>(); 
            return base_2;
        }
        //For 1-step
        ArrayList<String> rr1= Stair_path(n-1);

        //For 2-step
        ArrayList<String> rr2= Stair_path(n-2);

        //For 3-step
        ArrayList<String> rr3= Stair_path(n-3);

        ArrayList<String> myans= new ArrayList<>();

        for(int i=0; i<rr1.size(); i++){
            myans.add(rr1.get(i));
        }

        for(int i=0; i<rr1.size(); i++){
            myans.add(rr2.get(i));
        }

        for(int i=0; i<rr1.size(); i++){
            myans.add(rr3.get(i));
        }
        return myans;
    }
}