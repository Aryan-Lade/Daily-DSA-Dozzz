//2965. Find Missing and Repeated Values

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int x=0,y=0;
        int n=grid.length;
        int[] freq=new int[n*n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                freq[grid[i][j]]++;
            }
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==2){
                y=i;
            }
            if(freq[i]==0){
                x=i;
            }
        }
        return new int[]{y,x};
    }
}