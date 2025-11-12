class Solution {
    static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a = temp;
        }
        return a;
    }
    public int minOperations(int[] nums) {
        int n=nums.length;
        int ones=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                ones++;
            }
        }
        if(ones>0){
            return n-ones;
        }

        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            int g=nums[i];
            for(int j=i+1;j<n;j++){
                g=gcd(g,nums[j]);
                if(g==1){
                    mini=Math.min(mini,j-i+1);
                    break;
                }
            }
        }
        if (mini == Integer.MAX_VALUE) return -1;
        return (mini - 1) + (n - 1);
    }
}
