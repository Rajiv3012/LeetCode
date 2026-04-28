class Solution {
    public String sortVowels(String s) {
        int n= s.length();
        Set<Character> set = Set.of('a','e','i','o','u');//Set hoga hashset nahi cuz immutable 
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> idx = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                map.put(ch,map.getOrDefault(ch,0)+1);
                idx.putIfAbsent(ch,i);
            }
        }
        ArrayList<Character> freq = new ArrayList<>(map.keySet());
        Collections.sort(freq,(a,b)->{
            if(map.get(a).equals(map.get(b)))return idx.get(a)-idx.get(b);
            else return map.get(b)-map.get(a);
        });
        ArrayList<Character> vowels = new ArrayList<>();
        int index=0;
        for(char ch: freq){
            int count= map.get(ch);
            while(count>0){
                vowels.add(ch);
                count--;
            }
        }
        index=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                sb.append(vowels.get(index));
                index++;
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}