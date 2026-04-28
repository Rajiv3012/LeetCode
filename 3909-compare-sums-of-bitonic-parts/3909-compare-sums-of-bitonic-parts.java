class Solution {
    public int compareBitonicSums(int[] nums) {
        int low =1;
        int high= nums.length-2;
        int n= nums.length;
        long presum []= new long[n];
        presum[0]=nums[0];
        for(int i=1;i<n;i++){
            presum[i]= presum[i-1]+nums[i];
        }
        while(low<=high){
            int mid= low+(high-low)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                long leftsum= presum[mid];
                long rightsum= presum[n-1]- presum[mid-1];
                if(leftsum>rightsum)return 0;
                if(rightsum>leftsum)return 1;
                if(leftsum==rightsum)return -1;
            }else if(nums[mid]<nums[mid+1])low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
}