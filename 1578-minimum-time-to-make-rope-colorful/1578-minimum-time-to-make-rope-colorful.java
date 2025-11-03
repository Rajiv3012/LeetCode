class Solution {
    public int minCost(String colors, int[] neededTime) {
        int sum=0;
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(i)== colors.charAt(i-1)){
                int mini = Math.min(neededTime[i],neededTime[i-1]);
                neededTime[i]=Math.max(neededTime[i], neededTime[i-1]);
                sum = sum+mini;
            }
        }
        return sum;
    }
}