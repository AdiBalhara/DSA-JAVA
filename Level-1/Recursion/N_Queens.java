import java.util.*;

public class N_Queens{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        boolean chess[][]=new boolean[n][n];
        n_queens(chess,"",0);
    }
    public static void n_queens(boolean [][]chess, String asf, int row){

        if (row==chess.length) {
            System.out.println(asf+".");
            return;
        }
        
        for(int col=0; col<chess.length; col++){
            if(is_safe(chess,row,col)==true){
                chess[row][col]=true;
                n_queens(chess,asf+row+"-"+col+",", row+1);
                chess[row][col]=false;
            }
        }
    }
    public static boolean is_safe(boolean [][]chess,int row, int col){
        for(int i=row-1,j=col+1; i>=0 && j<chess.length; i--,j++){
            if(chess[i][j]==true){
                return false;
            }
        }
        for (int i=row-1, j=col; i>=0; i--){
            if(chess[i][col]==true){
                return false;
            }
        }
        for(int i=row-1, j=col-1; i>=0 && j>=0; j--,i--){
            if(chess[i][j]==true){
                return false;
            }
        }
        return true;
    }
}