class Solution {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<n;i++){
            char ch= sentence.charAt(i);
            set.add(ch);
        }
        if(set.size()==26)return true;
        else return false;
    }
}