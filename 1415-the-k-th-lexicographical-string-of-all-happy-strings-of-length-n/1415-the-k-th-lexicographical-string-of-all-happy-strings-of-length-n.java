class Solution {
    public String getHappyString(int n, int k) {
        List<String>list = new ArrayList<>();
        gen(list,n,"");
        if(list.size()<k){
            return "";
        }
        Collections.sort(list);
        return list.get(k-1);
    }
    public void gen (List<String>list,int n,String curr){
        if(curr.length()==n){
            list.add(curr);
            return;
        }
        char [] arr = {'a','b','c'};
        for(char c : arr){
            if(curr.isEmpty() || curr.charAt(curr.length()-1)!=c){
                gen(list,n,curr+c);
            }
        }
    }
}