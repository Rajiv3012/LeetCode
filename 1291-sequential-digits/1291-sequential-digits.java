class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res= new ArrayList<>();
        String s = "123456789";
        int minlen= String.valueOf(low).length();
        int maxlen= String.valueOf(high).length();
        for(int i=minlen;i<=maxlen;i++){
            for(int j=0;j+i<=9;j++){
                String sub= s.substring(j,j+i);
                int num= Integer.parseInt(sub.toString());
                if(num>=low && num<=high){
                    res.add(num);
                }
            }
        }
        return res;
    }
}