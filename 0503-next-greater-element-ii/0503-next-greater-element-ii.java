class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int []ans = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                map.put(nums[i],-1);
            }else{
                map.put(nums[i],nums[st.peek()]);
            }
            st.push(i);
        }
        for(int i=0;i<n;i++){
            ans[i]=map.get(nums[i]);
        }
        return ans;
    }
}