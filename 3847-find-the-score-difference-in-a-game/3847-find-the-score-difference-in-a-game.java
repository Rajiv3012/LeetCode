class Solution {
    public int scoreDifference(int[] nums) {
        int n = nums.length;
        int play1 = 0, play2 = 0;
        boolean check = true; 
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 1) 
                check = !check;
            if ((i + 1) % 6 == 0) 
                check= !check;
            if (check==true) 
                play1 += nums[i];
            else 
                play2 += nums[i];
        }
        return play1 - play2;
    }
}