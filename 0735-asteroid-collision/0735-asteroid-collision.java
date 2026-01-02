class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int curr : asteroids) {

            if (st.isEmpty() || curr > 0) {
                st.push(curr);
            } else {
                while (!st.isEmpty()) {
                    int top = st.peek();

                    // both moving left → no collision
                    if (top < 0) {
                        st.push(curr);
                        break;
                    }

                    int absVal = Math.abs(curr);

                    // equal size → both destroyed
                    if (absVal == top) {
                        st.pop();
                        break;
                    }
                    // current smaller → destroyed
                    else if (absVal < top) {
                        break;
                    }
                    // current larger → pop top & continue
                    else {
                        st.pop();
                        if (st.isEmpty()) {
                            st.push(curr);
                            break;
                        }
                    }
                }
            }
        }

        int[] ans = new int[st.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
}
