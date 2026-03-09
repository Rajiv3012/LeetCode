class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n = words.length;
        List<Integer> indices = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            for(char c : words[i].toCharArray()){
                if(c == x){
                    indices.add(i);  //  add karo index
                    break;
                }
            }
        }
        return indices;
    }
}