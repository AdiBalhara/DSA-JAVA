
import java.util.*;

public class Print_Permutation{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        permutation(str,"");
    }
    public static void permutation(String str, String asf){
         for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            String ros=str.substring(0,i)+str.substring(i+1);
            permutation(ros,asf+ch);
         }
    }
}