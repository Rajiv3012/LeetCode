class Solution {
    public int passwordStrength(String password) {
        int total =0;
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<password.length();i++){
            char ch = password.charAt(i);
            set.add(ch);
        }
        for(char c: set){
            if(c>=97 && c<=122){
                total+=1;
            }
            if(c>=65 && c<=90){
                total+=2;
            }
            if(c-'0'>=0 && c-'0'<=9){
                total+=3;
            }
            if(c=='!'||c=='@'||c=='#'||c=='$'){
                total+=5;
            }
        }
        return total;
    }
}