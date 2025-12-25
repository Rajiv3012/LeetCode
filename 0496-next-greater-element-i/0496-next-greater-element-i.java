class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] res = new int[nums1.length];
        int n= nums2.length;
        for(int i=n-1;i>=0;i--){
        while(!st.isEmpty() && st.peek()<=nums2[i]){
            st.pop();
        }
        if(st.isEmpty()){
            map.put(nums2[i],-1);
        }else{
            map.put(nums2[i],st.peek());
        }
        st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            res[i]=map.get(nums1[i]);
        }
        return res;
    }
}

//brute force
// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         int[] ans = new int[nums1.length];

//         for (int i = 0; i < nums1.length; i++) {
//             int target = nums1[i];
//             int index = -1;

//             // find index of nums1[i] in nums2
//             for (int j = 0; j < nums2.length; j++) {
//                 if (nums2[j] == target) {
//                     index = j;
//                     break;
//                 }
//             }

//             // find next greater element
//             ans[i]=-1;
//             for (int k = index + 1; k < nums2.length; k++) {
//                 if (nums2[k] > target) {
//                     ans[i] = nums2[k];
//                     break;
//                 }
//             }
//         }
//         return ans;
//     }
// }
