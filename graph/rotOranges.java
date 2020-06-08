
//User function Template for Java

// a : given matrix
// R and C : number of rows and columns respectively
class Cell{
    int x;
    int y;
    Cell(int x,int y){
        this.x = x;
        this.y = y;
    }
}
 class Solution
{
    public int rotOranges(int a[][],int r, int c)
    {
        
        // Write your code here
        Queue<Cell> queue = new LinkedList<>();
        int minutes = 0;
        int[][] dir = neAw int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a[i][j] == 2){
                    queue.add(new Cell(i,j));
                }
            }
        }
        
        queue.add(new Cell(-1,-1));
        
        while(!queue.isEmpty()){
            //System.out.println(queue);
            Cell curr = queue.poll();
            if(curr.x==-1 && curr.y == -1){
                if(queue.size()>0){
                    ++minutes;
                    queue.add(new Cell(-1,-1));
                }
            }
            else{
                int x = curr.x;
                int y = curr.y;
                
                for(int[] d : dir){
                    int x1 = x+d[0];
                    int y1 = y+d[1];
                    
                    if(x1>=0 && y1>=0 && x1<a.length && y1<a[x1].length && a[x1][y1]==1){
                        a[x1][y1] = 2;
                        queue.add(new Cell(x1,y1));
                    }
                }
            }
        }
        
        for(int[] i : a){
            for(int j : i){
                if(j == 1) return -1;
            }
        }
        
        return minutes;
    }
    
}



