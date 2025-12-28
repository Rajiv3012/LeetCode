class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int [] prefixsum = new int[n];
        int [] suffixsum = new int[n];
        int sum=0;
        prefixsum[0]=height[0];
        for(int i=1;i<n;i++){
            prefixsum[i]=Math.max(height[i],prefixsum[i-1]);
        }
        suffixsum[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            suffixsum[i]= Math.max(height[i],suffixsum[i+1]);
        }
        for(int i=0;i<n;i++){
            sum+=Math.min(prefixsum[i],suffixsum[i])-height[i];
        }
        return sum;
    }
}