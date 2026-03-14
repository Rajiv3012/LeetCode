class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            while(nums[i]>=nums[i+1]){
                nums[i+1]++;
                count++;
            }
        }
        return count;
    }
}
   // public static void main(String[] args) {
    //     Solution sol = new Solution();
    //
    //     int[] nums1 = {1, 1, 1};
    //     System.out.println(sol.minOperations(nums1)); // Output: 3
    //
    //     int[] nums2 = {1, 5, 2, 4, 1};
    //     System.out.println(sol.minOperations(nums2)); // Output: 14
    //
    //     int[] nums3 = {8};
    //     System.out.println(sol.minOperations(nums3)); // Output: 0
    // }

    // Time Complexity  : O(n) — array ek baar traverse hota hai
    // Space Complexity : O(1) — koi extra space nahi, in-place update
