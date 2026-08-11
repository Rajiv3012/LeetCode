class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>ans = new ArrayList<>();
        HashMap<Character,Integer>p1= new HashMap<>();
        HashMap<Character,Integer>window= new HashMap<>();
        int l=0;
        for(int i=0;i<p.length();i++){
            char a = p.charAt(i);
            p1.put(a,p1.getOrDefault(a,0)+1);
        }
        for(int r=0;r<s.length();r++){
            char ch = s.charAt(r);
            window.put(ch, window.getOrDefault(ch,0)+1);
            if(r-l+1>p.length()){
                char rem = s.charAt(l);
                window.put(rem,window.getOrDefault(rem,0)-1);
                if(window.get(rem)==0){
                    window.remove(rem);
                }
                l++;
            }
            
            if(r-l+1==p.length()){
                if(p1.equals(window)){
                    ans.add(l);
                }
            }
        }
        return ans;
    }
}