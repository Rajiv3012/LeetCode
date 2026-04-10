class Solution {
    public int minimumRecolors(String blocks, int k) {
        int mini = Integer.MAX_VALUE;
        int steps=0;
        int left=0;
        int count=0;
        for(int i=0;i<blocks.length();i++){
            if(blocks.charAt(i)=='W'){
                steps++;
            }
            if(i>=k){
                if(blocks.charAt(left)=='W'){
                    steps--;
                }
                left++;
            }
            if(i>=k-1){
            mini = Math.min(mini,steps);
            }
        }
        return mini;
    }
}