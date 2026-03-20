class Solution {
    public static boolean check(int [] freq){
        int ex =-1;
        for(int ele:freq){
            if(ele>0){
                if(ex==-1){
                    ex=ele;
                }else if(ex!=ele){
                    return false;
                }
            }
        }
        return true;
    }
    public int longestBalanced(String s) {
        int maxi=0;
        for(int i=0;i<s.length();i++){
            int freq[] = new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                if(check(freq)){
                    maxi = Math.max(maxi,j-i+1);
                }
            } 
        }
        return maxi;
    }
}