class Solution {
        private int [] findnse(int arr[]){
            int n= arr.length;
            int nse[] = new int[n];
            Stack<Integer> st = new Stack<>();
            for(int i=n-1;i>=0;i--){
                while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                    st.pop();
                }
                nse[i] = st.isEmpty()?n:st.peek();
                st.push(i);
            }
            return nse;
        }
        private int [] findpsee(int [] arr){
            int n= arr.length;
            int psee[] = new int[n];
            Stack<Integer> st = new Stack<>();
            for(int i=0;i<n;i++){
                while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                    st.pop();
                }
                psee[i]=st.isEmpty()?-1:st.peek();
                st.push(i);
            }
            return psee;
        }
    public int sumSubarrayMins(int[] arr) {
        long sum=0;
        int n = arr.length;
        int mod = 1000000007;
        int [] nse = findnse(arr);
        int [] psee = findpsee(arr);
        for(int i=0;i<n;i++){
            long right = nse[i]-i;
            long left = i-psee[i];
            long freq = left*right*1l;
            sum = (sum+freq*arr[i])%mod;
        }
        return (int) sum;
    }
}
//brute force with tle

// class Solution {
//     public int sumSubarrayMins(int[] arr) {
//         int mod=1000000007;
//         long sum=0;
//         for(int i=0;i<arr.length;i++){
//             int mini = arr[i];
//             for(int j=i;j<arr.length;j++){
//                 mini= Math.min(mini,arr[j]);
//                 sum=(sum+mini)%mod;
//             }
//         }
//         return (int)sum;
        
//     }
// }