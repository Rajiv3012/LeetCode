class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        HashSet<Character> set = new HashSet<>();
        for(char j : jewels.toCharArray()){
            set.add(j);
        }
        for(char c : stones.toCharArray()){
            if(set.contains(c)){
                count++;
            }
        }
        return count;
    }
}