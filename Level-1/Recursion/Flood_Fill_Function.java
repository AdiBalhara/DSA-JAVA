
import java.util.Scanner;

public class Flood_Fill_Function{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int maze[][]=new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                maze[i][j]=scn.nextInt();
            }
        }
        boolean visited[][]=new boolean[n][m];
        Flood_Fill(maze,0,0," ",visited);
    }
    public static void Flood_Fill(int maze[][], int sr, int sc, String asf, boolean visited[][]){
        if (sr<0 || sc<0 || sr>maze.length || sc>maze[0].length || visited[sr][sc]==true || maze[sr][sc]==1) {
            return;
        }

        if(sr==maze.length && sc==maze[0].length){
            System.out.println(asf);
            return;
        }
        
        visited[sr][sc]=true;
        Flood_Fill(maze, sr-1, sc, asf+"t", visited);
        Flood_Fill(maze, sr-1, sc, asf+"t", visited);
        Flood_Fill(maze, sr-1, sc, asf+"t", visited);
        Flood_Fill(maze, sr-1, sc, asf+"t", visited);
        visited[sr][sc]=false;
    }
}