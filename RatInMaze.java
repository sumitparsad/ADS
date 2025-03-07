import java.util.*;
public class RatInMaze {
    public static void main(String[] args) {
        // Given n*n grid where some cells are blocked(denoted by 0)
        // and other are not blocked denoted by 1.
        // a rat starts at the top left cell and needs to reach bottom right cell
        // the rat can move down right up left but can't move in blocked cells
        // we need to find all the possible paths.
        // Approac:
        // Start at(0,0),mark it as visited.
        // try moving in all directions(D,U,L,R)
        // if the destination reached add the current path to result.
        // if moving leads to invalid,backstrack.
        // use a boolean array to keep track of visited cells.
          int[][]maze={{1,0,0,0},
                     {1,1,0,1},
                     {0,1,0,1},
                     {1,1,1,1}};

        List<String> paths=FPIM(maze);
        System.out.println(paths);

    }
        private static void fP(int[][]maze,int x,int y,boolean[][]vist,String path,int n,List<String>paths){
            if(x==n-1 && y==n-1){
                paths.add(path);
                return;
            }
            int []dx={1,0,-1,0};
            int[]dy={0,1,0,-1};
            char[]move={'D','R','U','L'};
            for(int i=0;i<4;i++){
                int newX=x+dx[i];
                int newY=y+dy[i];
               if( isSafe(newX, newY,n, maze, vist)){
                   vist[newX][newY]=true;
                   fP(maze, newX, newY, vist, path+move[i],n,paths);
                   vist[newX][newY]=false;
               }
            }
        }
        private static boolean isSafe(int x,int y,int n,int[][]maze,boolean[][]vist){
            return x>=0&&y>=0&&x<n&&maze[x][y]==1&&!vist[x][y];
        }
        public static List<String>FPIM(int[][]maze){
            List<String> paths=new ArrayList<>();
            int n=maze.length;
            if(maze[0][0]==0 || maze[n-1][n-1]==0) return paths;
            boolean[][]vist=new boolean[n][n];
            vist[0][0]=true;
            fP(maze,0,0,vist,"",n,paths);
            return paths;
        }
    
        }


