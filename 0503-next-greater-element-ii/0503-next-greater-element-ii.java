import java.util.*;

public class Solution {

    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i % n]) {
                st.pop();
            }
            if (i < n) {
                ans[i] = st.isEmpty() ? -1 : st.peek();
            }
            st.push(nums[i % n]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = nextGreaterElements(nums);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}

