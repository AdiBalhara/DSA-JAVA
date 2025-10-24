import java.util.Scanner;

public class Maze_Path {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int rows=scn.nextInt();
        int columns=scn.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                
            }
        }
        String result=maze(0,0,rows,columns,""); 
        System.out.println(result);
    }

    public static String maze(int sr, int sc, int dr, int dc, String asf){
        
        if(sr>dr || sc>dc){
            return "";
        }
        if(sr==dr && sc==dc){
            return asf;
        }
        

        String h=maze(sr, sc+1, dr, dc, asf+"h");
        String v=maze(sr+1, sc, dr, dc, asf+"v");

        return h+v;

    }
}
