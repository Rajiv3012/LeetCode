class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int left=0;
        int count=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int r=0;r<n;r++){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            while(map.size()==3){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left))==0){
                    map.remove(s.charAt(left));
                }
                left++;
                count+= n-r;
            }
        }
            return count;
    }
}