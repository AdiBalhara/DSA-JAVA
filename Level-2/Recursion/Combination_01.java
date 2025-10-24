import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Combination_01{
    public static void main(String[] args){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int nboxes=Integer.parseInt(br.readLine());
        int items=Integer.parseInt(br.readLine());
        solution(1, nboxes, 0, items, "");
    }
    public static void solution(int cb, int tb, int ssf, int ts, String asf){

        if(cb>tb){
            if(ssf==ts){
                System.out.println(asf);
            }
            return;
        }
        //Include
        solution(cb+1, tb, ssf+1, ts, asf+ "i");

        //Exclude
        solution(cb, tb, ssf, ts, asf+ "");


    }
}