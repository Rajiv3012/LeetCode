class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> res = new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            for(int j=0;j<dictionary.length;j++){
                if(isValid(queries[i],dictionary[j])){
                    res.add(queries[i]);
                    break;
                }
            }
        }
        return res;
    }
    boolean isValid(String a, String b){
        int diff=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                diff++;
                if(diff>2)return false;
            }
        }
        return true;
    }
}