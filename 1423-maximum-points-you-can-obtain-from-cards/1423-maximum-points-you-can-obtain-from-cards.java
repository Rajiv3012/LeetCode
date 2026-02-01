class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0;
        for(int i=0;i<k;i++){
            lsum+= cardPoints[i];
        }
        int maxsum=lsum;
        int rsum=0;
        int n = cardPoints.length;
        int i = n-1;
        for(int r=k-1;r>=0;r--){
            lsum-=cardPoints[r];
            rsum+=cardPoints[i];
            i--;
            maxsum= Math.max(maxsum,lsum+rsum);
        }
        return maxsum;
    }
}