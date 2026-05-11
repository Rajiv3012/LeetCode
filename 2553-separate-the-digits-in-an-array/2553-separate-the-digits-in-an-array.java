class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            while(nums[i]>0){
                int k = nums[i]%10;
                nums[i]/=10;
                st.push(k);
            }
            while(!st.isEmpty()) {
                list.add(st.pop());
            }
        }
        int[] arr = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}