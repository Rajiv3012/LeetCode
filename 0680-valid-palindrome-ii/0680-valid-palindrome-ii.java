class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int r=n-1;
        int l=0;
        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }
            else{
                return isPalindrome(s,l+1,r) || isPalindrome(s,l,r-1);
            }
        }
        return true;
    }
    public boolean isPalindrome(String s,int left , int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
                left++;
                right--;
        }
        return true;
    }
}