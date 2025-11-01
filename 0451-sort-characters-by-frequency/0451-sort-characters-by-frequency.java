class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            int val =0;
            char k = s.charAt(i);
                map.put(k,map.getOrDefault(k,0)+1);
        }
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entry: list){
            char c = entry.getKey();
            int freq = entry.getValue();
        for(int i=0;i<freq;i++)
        {
            sb.append(c);
        }
        }
        return sb.toString();

    }
}