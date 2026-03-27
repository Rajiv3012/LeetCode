class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        for(int i=0;i<mat.length;i++){
            int shift[] = new int[mat.length];
            if(i%2==0){
                shift=leftshift(mat[i],k);
            }else{
                shift= rightshift(mat[i],k);
            }
            if (!Arrays.equals(shift, mat[i])) return false;
        }
        return true;
    }
    public int[] rightshift(int [] row,int k){
        int n=row.length;
        int []result = new int[n];
        for(int i=0;i<n;i++){
            result[i]= row[(i+k)%n];
        }
        return result;
    }
    public int[] leftshift(int []row,int k){
        int n=row.length;
        int []result = new int[n];
        for(int i=0;i<n;i++){
            result[i]= row[((i-k)%n+n)%n];
        }
        return result;
    }
}
