class Solution {
    public int minimumOneBitOperations(int n) {
        if(n==0)return 0;

        int F[] = new int[31];
        F[0] = 1;
        for(int i=1;i<=30;i++)F[i]=2*F[i-1]+1;

        int result = 0;
        int sign = 1;

        for(int i=30;i>=0;i--){
            int setBit = n&(1<<i);
            if(setBit==0)continue;
            
            if(sign>0)result+=F[i];
            else result-=F[i];

            sign*=-1;
        
        }
        return result;
    }
}