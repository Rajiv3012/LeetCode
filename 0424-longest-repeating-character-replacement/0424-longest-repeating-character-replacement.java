class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n=s.length();
        int l=0;
        int maxfreq=0;
        int res=0;
        for(int r=0;r<n;r++){
            char c = s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);
            maxfreq = Math.max(maxfreq,map.get(c));
            while(r-l+1 - maxfreq >k ){
                char left = s.charAt(l);
                map.put(left,map.get(left)-1);
                l++;
            }
            res=Math.max(res,r-l+1);
        }
        return res;

    }
}