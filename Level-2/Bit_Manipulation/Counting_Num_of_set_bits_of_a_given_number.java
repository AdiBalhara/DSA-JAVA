import java.util.*;
public class Counting_Num_of_set_bits_of_a_given_number{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int result=solution(n);
        System.out.println(result);
    }
    public static int solution(int n){

        int count=0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n>>=1;
        }
        return count;
    }
}