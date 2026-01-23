class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int maxlen=0;
        int left=0;
        for(int right=0;right<n;right++){
            while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }
            set.add(s.charAt(right));
            maxlen = Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}