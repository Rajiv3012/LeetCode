class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n= nums.length;
        int[] res = new int[2*n];
        for(int i=0;i<n;i++){
            res[i]=nums[i];
        }
        int idx=n;
        for(int i=n-1;i>=0;i--){
            res[idx++]=nums[i];
        }
        return res;
    }
}