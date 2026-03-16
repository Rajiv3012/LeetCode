class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int []maxleft = new int[n];
        int []minright = new int[n];
        maxleft[0]=arr[0];
        for(int i=1;i<n;i++){
            maxleft[i]= Math.max(maxleft[i-1],arr[i]);
        }
        minright[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            minright[i] = Math.min(minright[i+1],arr[i]);
        }
        int chunk =0;
        for(int i=0;i<n-1;i++){
            if(maxleft[i]<=minright[i+1]){
                chunk++;
            }
        }
        return chunk+1;
    }
}