class Solution {
    public int maxVowels(String s, int k) {
        String vowels = "aeiou";
        int left=0;
        int maxi=0;
        int count=0;
        for(int r=0;r<s.length();r++){
            if(vowels.indexOf(s.charAt(r))!=-1){
                count++;
            }
            if(r>=k){
                if(vowels.indexOf(s.charAt(left))!=-1){
                    count--;
                }
                left++;
            }
            maxi = Math.max(maxi,count);
        }
        return maxi;
    }
}