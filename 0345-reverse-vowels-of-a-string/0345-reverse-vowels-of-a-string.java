import java.util.*;

class Solution {

    public void rev(char[] arr, int len) {
        int left = 0, right = len - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public String reverseVowels(String s) {
        int n = s.length();
        Set<Character> set = Set.of('a','e','i','o','u','A','E','I','O','U');

        char[] vowels = new char[n];
        int idx = 0;

        // collect vowels
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                vowels[idx++] = ch;
            }
        }

        // reverse only actual vowels
        rev(vowels, idx);

        StringBuilder sb = new StringBuilder();
        int index1 = 0;

        // rebuild string
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (set.contains(ch)) {
                sb.append(vowels[index1++]);
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}