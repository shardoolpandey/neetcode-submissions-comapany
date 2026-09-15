class Solution {
    class Pair
    {
        int x;
        int y;
        Pair(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
    public int numIslands(char[][] grid) {
        int ans=0;
        int m=grid.length;
        int n=grid[0].length;
        char arr[][]=grid;
        boolean check[][]=new boolean[m][n];
        int arr_x[]={1,-1,0,0};
        int arr_y[]={0,0,-1,1};
        Queue<Pair> queue=new LinkedList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]=='1' && check[i][j]==false)
                {
                    queue.add(new Pair(i,j));
                    check[i][j]=true;
                    while(!queue.isEmpty())
                    {
                        Pair node=queue.poll();
                        for(int k=0;k<4;k++)
                        {
                            int next_i=node.x +arr_x[k];
                            int next_j=node.y+arr_y[k];
                            if(next_i>=0 && next_i<m && next_j>=0 && next_j<n && arr[next_i][next_j]=='1' && check[next_i][next_j]==false)
                            {
                                check[next_i][next_j]=true;
                                queue.add(new Pair(next_i,next_j));
                            }
                        }
                    }
                    ans++;
                }
            }
        }
        return ans;
    }
}
