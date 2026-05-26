class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            set.add(ch);
        }
        int count=0;
        for(char ch:set){
            if(Character.isLowerCase(ch) &&set.contains(Character.toUpperCase(ch))){
                count++;
            }
        }
        return count;
    }
}