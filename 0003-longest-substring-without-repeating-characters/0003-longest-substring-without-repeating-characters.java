class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        HashSet<Character>set= new HashSet<>();
        int left=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxlen= Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }
}