class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        return gen(num);
    }
    private boolean gen(int num){
        for(int i=0;i<=num;i++){
            if(i+rev(i)==num){
                return true;
            }
        }
        return false;
    }
    private int rev( int i){
        int reve =0;
        while(i>0){
            reve= reve*10 + i%10;
            i=i/10;
        }
        return reve;
    }
}