import java.util.Scanner;

public class Right_Most_Set_Bit{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int mask=(~n)+1; // 2's complement
        int rsb=n&mask;
        System.out.println(Integer.toBinaryString(rsb));
    }
}