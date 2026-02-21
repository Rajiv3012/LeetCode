class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n = answerKey.length();
        int j=0;
        int maxfreq=0;
        int res=0;
        for(int i=0;i<n;i++){
            char c = answerKey.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            maxfreq= Math.max(maxfreq,map.get(c));
            while(i-j+1>maxfreq+k){
                char d = answerKey.charAt(j);
                map.put(d,map.get(d)-1);
                j++;
            }
            res = Math.max(res,i-j+1);
        }
        return res;
    }
}