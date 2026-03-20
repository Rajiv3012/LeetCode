class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int n = tokens.length;
        int score=0;
        int maxi=0;
        int i=0;
        int j=n-1;
        while(i<=j){
            if(power>=tokens[i]){
                score++;
                power=power-tokens[i];
                i++;
            }
            else if(score>0){
                power+= tokens[j];
                score--;
                j--;
            }else{
                break;
            }
            maxi= Math.max(maxi,score);
        }
        return maxi;
    }
}