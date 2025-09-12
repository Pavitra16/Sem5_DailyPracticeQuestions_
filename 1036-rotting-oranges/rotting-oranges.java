class pair{
    int first;
    int sec;
    int level;
    public pair(int first, int sec, int level){
        this.first=first;
        this.sec=sec;
        this.level=level;
    }
}
class Solution {

    public int orangesRotting(int[][] grid) {
        Queue<pair>q=new LinkedList<>();
        int [][] visited=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(new pair(i,j,0));
                    visited[i][j]=1;
                }
            }
        }
        int lev=bfs(q, grid, visited);
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1) return -1;
            }
        }
        return lev;
    }
    public int bfs(Queue<pair>q, int[][] grid, int[][] visited){
        int lev=0;
        
        while(!q.isEmpty()){
            int l=q.peek().level;
            int row=q.peek().first;
            int col=q.peek().sec;
            lev=Math.max(l,lev);
            q.poll();
            int r[]={-1,0,1,0};
            int c[]={0,1,0,-1};
            for(int i=0;i<r.length;i++){
                int nrow=row+ r[i];
                int ncol=col + c[i];
                
                if(nrow>=0 && ncol>=0 && nrow<grid.length && ncol<grid[0].length && 
                grid[nrow][ncol]==1 && visited[nrow][ncol]==0){
                    q.add(new pair(nrow,ncol,lev +1));
                    visited[nrow][ncol]=1;
                    grid[nrow][ncol]=2;
                }
            }
        }
        return lev;
    }

}