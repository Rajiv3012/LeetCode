class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> vowelFreq = new HashMap<>();
        HashMap<Character, Integer> consoFreq = new HashMap<>();
        
        String vowels = "aeiou";
        
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                // vowel hai
                vowelFreq.put(c, vowelFreq.getOrDefault(c, 0) + 1);
            } else {
                // consonant hai
                consoFreq.put(c, consoFreq.getOrDefault(c, 0) + 1);
            }
        }
        
        // ab dono maps mein se max dhundho
        int maxVowel = 0, maxConso = 0;
        
        for (int freq : vowelFreq.values()) {
            maxVowel = Math.max(maxVowel, freq);
        }
        
        for (int freq : consoFreq.values()) {
            maxConso = Math.max(maxConso, freq);
        }
        
        return maxVowel + maxConso;
    }
}