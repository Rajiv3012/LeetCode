1class Solution {
2    public int countPairs(List<Integer> nums, int target) {
3        int count=0;
4        int n = nums.size();
5        for(int i=0;i<n;i++){
6            for(int j=0;j<n;j++){
7                if(i>=0 && j>i && (nums.get(i)+nums.get(j))<target){
8                    count++;
9                }
10            }
11        }
12        return count;
13    }
14}