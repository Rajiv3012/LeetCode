//import java.util.*;
class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>=5){
            n/=5;
            count+=n;
        }
        return count;
    }
}
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     Solution sol = new Solution();
//     System.out.println("Trailing zeroes: " + sol.trailingZeroes(n));
//     sc.close();
// }