import java.io.*;
import java.util.Scanner;

public class Recursion_on_the_way_up {
        public static void main(String[] args) {
            Scanner scn=new Scanner(System.in);
            String str=scn.next();
            String asf="";
            String result=Rec(str,asf);
            System.out.println(result);
        }   
        
        public static String Rec(String str,String asf)
        {
                
            if(str.length()==0){
                return asf +"\n";
            }
            char ch=str.charAt(0);
            String ros=str.substring(1);

            //Include
            String left =Rec(ros,asf);

            //Exclude
            String right =Rec(ros,asf+ch);

            return left + right;
        }

}

