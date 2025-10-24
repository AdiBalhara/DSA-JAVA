import java.util.*;
public class Print_Subsequence{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        subsequence(str,"");
    }
    public static void subsequence(String str, String asf){

        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        
        char ch=str.charAt(0);
        String ros=str.substring(1);

        //include
        subsequence(ros, asf+ch);

        //exclude
        subsequence(ros, asf);
    }
}