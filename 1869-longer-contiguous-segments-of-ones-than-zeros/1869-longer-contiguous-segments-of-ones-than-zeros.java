class Solution {
    public boolean checkZeroOnes(String s) {
        int maxOne = 0;
        int maxZero = 0;
        int currentOnes = 0;
        int currentZeros = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                currentOnes++;      // Increment ones
                currentZeros = 0;   // Reset zeros
            } else {
                currentZeros++;     // Increment zeros
                currentOnes = 0;    // Reset ones
            }
            
            // Keep track of the best we've seen so far at every step
            maxOne = Math.max(maxOne, currentOnes);
            maxZero = Math.max(maxZero, currentZeros);
        }

        return maxOne > maxZero;
    }
}