import java.util.Scanner;
import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            char digit = num.charAt(i);

            while (!st.isEmpty() && k > 0 && st.peek() > digit) {
                st.pop();
                k--;
            }
            st.push(digit);
        }

        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        StringBuilder res = new StringBuilder();
        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        while (res.length() > 0 && res.charAt(res.length() - 1) == '0') {
            res.deleteCharAt(res.length() - 1);
        }

        if (res.length() == 0) return "0";

        return res.reverse().toString();
    }
}

// Driver class
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        String num = sc.next();   // number as string
        int k = sc.nextInt();     // number of digits to remove

        Solution sol = new Solution();
        String result = sol.removeKdigits(num, k);

        // Output
        System.out.println(result);

        sc.close();
    }
}
